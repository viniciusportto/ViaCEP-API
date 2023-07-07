package br.com.cepconsult;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class ArchiveGenerator {

    public void saveJson(Address address) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter writerGenerete = new FileWriter(address.cep() + ".json");
        writerGenerete.write(gson.toJson(address));
        writerGenerete.close();
    }

}
