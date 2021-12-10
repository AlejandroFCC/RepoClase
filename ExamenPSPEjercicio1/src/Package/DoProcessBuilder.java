package Package;

import java.io.*;
   import java.util.*;
   
   public class DoProcessBuilder {
     public static void main(String args[]) throws IOException {

       if (args.length <= 0) {
         System.err.println("Necesito un comandop para funcionar");
         System.exit(-1);
       }

       Process process = new ProcessBuilder(args).start();
       InputStream is = process.getInputStream();
       InputStreamReader isr = new InputStreamReader(is);
       BufferedReader br = new BufferedReader(isr);
       String line;

       System.out.printf("la salida de ejecucion %s es:", 
          Arrays.toString(args));

       while ((line = br.readLine()) != null) {
         System.out.println(line);
       }

     }
     
     
     
    } 