package com.cloudwick.training.core.io;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


/**
 * Created by cloudwickguest on 8/2/16.
 *
 *
 * apache common io
 *
 */
public class RandomFileExamples {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr       = new FileReader("User.csv");
        BufferedReader br   = new BufferedReader(fr,200);
        Scanner sc          = new Scanner(br);
        sc.useDelimiter(",\\s*");
        while (sc.hasNext()){
            System.out.println(sc.next());
        }
        sc.close();

        //writing content using files and paths nio package
        Path pobj   = Paths.get("InputData.txt");
        Charset cr  = Charset.forName("US-ASCII");

        try (BufferedWriter br2 = Files.newBufferedWriter(pobj,cr)) {
            String data = "11,F\n12,G\n13,H\n14,F";
            br2.write(data);
            br2.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}