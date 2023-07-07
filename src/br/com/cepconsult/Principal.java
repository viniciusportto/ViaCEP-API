package br.com.cepconsult;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        ConsultByCep consultByCep = new ConsultByCep();

        System.out.println("Write the CEP/Zip code for the search: ");
        var cep = read.nextLine();

        try {
            Address newAddress = consultByCep.searchByAddress(cep);
            System.out.println(newAddress);
            ArchiveGenerator generator = new ArchiveGenerator();
            generator.saveJson(newAddress);
        }catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizing the application");

        }
    }
}
