/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracao01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author vstillo
 */
public class Integracao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scanner = new Scanner(System.in);
        String nomeDoArquivo;
        
        System.out.println("Digite o nome do arquivo");
        nomeDoArquivo = scanner.nextLine();
        
        FileInputStream novoArquivo = new FileInputStream(nomeDoArquivo);

        int valorSaida;

        DataInputStream dataIn = new DataInputStream(novoArquivo);
        valorSaida = dataIn.readInt();
        System.out.println(Integer.toHexString(valorSaida));

        
    }
    
}