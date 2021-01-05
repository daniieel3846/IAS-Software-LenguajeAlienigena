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
        
        //Palabras 
        String[] arrayWords = new String[D];
        String linea="";
        int i=0;
        while(i<D){
            linea=objBufferedReader.readLine();
            arrayWords[i]=linea;
            i++;
        }
        
        for(int j=0;j<D;j++){
            System.out.println(arrayWords[j]);
        }
        
        
        

    }
}
