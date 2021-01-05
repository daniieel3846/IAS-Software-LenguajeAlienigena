package lenguajealienigena;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LenguajeAlienigena {
    
    public static void main(String[] args) throws IOException {
        int L; //letras minusculas
        int D; //Numero Palabras
        int N; //Casos de Prueba
        File objFile;
        FileReader objFileReader;
        BufferedReader objBufferedReader;

        objFile = new File("entrada.txt");
        objFileReader = new FileReader(objFile);
        objBufferedReader = new BufferedReader(objFileReader);

        String Firstline = objBufferedReader.readLine();
        String[] array=Firstline.split(" ");
        L=Integer.parseInt(array[0]);
        D=Integer.parseInt(array[1]);
        N=Integer.parseInt(array[2]);
        
        
    }
}
