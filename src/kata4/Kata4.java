package kata4;

import java.io.File;

public class Kata4 {

    public static void main(String[] args) {
        File file = new File("c:\\Users\\usuario"); //linux "c:/"
        print(file.listFiles(),""); //método recursivo
    }

    public static void print(File[] listFiles, String string) {
        if(listFiles ==null) return;
        for (File file : listFiles) {
            System.out.println(string + (file.isDirectory()?
                    "+" : "-") + file.getName());
            
            if(!file.isDirectory() || file.isHidden()) continue;
            print(file.listFiles(),"  ");
        }
    }

}
