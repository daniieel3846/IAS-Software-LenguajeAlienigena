package lenguajealienigena;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


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
        //Ver casos de prueba
        int j=0;
        while(j<N){
            linea=objBufferedReader.readLine();
            String lineaNueva=linea.replace("(","[").replace(")","]");
            Comparar(lineaNueva,arrayWords,D,j);
            j++;
        }
    }
    public static void Comparar(String Texto, String[] Arr, int D, int j) {
        int NroCoincidencia=0;
        for (int count = 0; count < D; count++) {
             Pattern P = Pattern.compile(Texto); //cadena a comparar
             Matcher M = P.matcher(Arr[count]); //busca la coincidencia
            if (M.matches()) {
                NroCoincidencia++;
            }
        }
        System.out.println("Caso #"+(j+1)+": "+NroCoincidencia);
    }
    
}
