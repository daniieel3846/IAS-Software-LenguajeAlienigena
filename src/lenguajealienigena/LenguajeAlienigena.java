package lenguajealienigena;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


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
        int j=1;
        String abre="(";
        String cierre=")";
        ArrayList<String> cadena=null;
        String []arr3=null; //arreglo que guarda una linea
        String [][]matriz=null;
        int col=0;
        while(j<2){
            linea=objBufferedReader.readLine();
            if(linea.contains(cierre)){
                System.out.println(linea);
                String lineaNueva=linea.replace("(","[").replace(")","]");
                System.out.println(lineaNueva);
                //StringTokenizer st = new StringTokenizer(linea);
                //while (st.hasMoreElements()) {
                  //  System.out.println(st.nextToken());
                   // int size=(st.countTokens());
                   /*
                    arr3=new String[size];
                    for(int k=0;k<arr3.length;k++){
                        arr3[k]=st.nextToken();
                    }*/
                //}
                
                //recorrido del vector arr3
                /*
                for(int k=0;k<arr3.length;k++){
                        //System.out.println(arr3[k]);
                        if(col<arr3[k].length())col=arr3[k].length();
                    }
                matriz=new String[arr3.length][col];
                //llenar matriz
                for (int n = 0; n < arr3.length; n++) {
                    for (int v = 0; v < col; v++) {
                        String[] arrSplit = arr3[n].split("");
                        matriz[n][v] = arrSplit[v];
                    }
                }
                for(int v=0;v<col;v++){
                    for(int n=0;n<arr3.length;n++){
                        System.out.print(matriz[n][v]);
                        System.out.print("\n");
                    }
                    System.out.print("\t");
                }*/
                  
                String[] arreglo=linea.split("");
                int c=0;
                
                for(int h=0;h<arreglo.length;h++){
                    if(arreglo[h].equals(abre)){
                      c++; 
                      cadena=FormarCadena(arreglo[h+1]);
                     
                      for(String l:cadena){
                        
                        
                          //System.out.println(l);
                          
                          
                        }
                   }
                    
                    /*
                    if((!abre.equals(arreglo[h])) && (!cierre.equals(arreglo[h]))){
                        ArrayList<String> letra=llenar(arreglo[h]);
                        for(String l:letra){
                            System.out.println(l);
                        }
                    }*/
                }
                
            }
               Comparar(linea,arrayWords,D,j);
            j++;
        }
        
        
        

    }
   
    public static ArrayList<String> FormarCadena(String n){
        ArrayList<String> letra = new ArrayList<String>();
        letra.add(n);
        return letra;
    }
    public static void Comparar(String Texto, String[] Arr, int D, int j) {
        int NroCoincidencia=0;
        for (int count = 0; count < D; count++) {
            if (Texto.equalsIgnoreCase(Arr[count])) {
                NroCoincidencia++;
            }
        }
        System.out.println("Caso #"+j+": "+NroCoincidencia);
    }
    
}
