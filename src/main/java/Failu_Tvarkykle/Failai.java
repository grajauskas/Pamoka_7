package Failu_Tvarkykle;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Failai {

    public static void main(String[] args) {
        String first = "D:\\JAVA\\Klases darbao 20220711_pamoka8\\pirmasTest.txt";

        File file = new File(first);
//
//        try {
//            boolean isItMade = file.createNewFile();
//            System.out.println(isItMade ? "Failas buvo sukurtas" : "Failas nebuvo sukurtas");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        String  text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse feugiat quis nisl a egestas\n";

        Path firsPat = Paths.get(first);

        try {
            Files.write(firsPat, text.getBytes());
            System.out.println("tekstas buvo pridetas");
        } catch (IOException e) {
            System.out.println("Ivyko klaida");
            e.printStackTrace();
        }


    }
}
