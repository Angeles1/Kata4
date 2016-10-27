package kata4;

import java.io.File;

public class Kata4 {

    public static void main(String[] args) {
        File file = new File("c:\\"); //linux "c:/"
        String [] names = file.list(); //guarda el listado y directorio de fichero
        for (String name : names) {
            System.out.println(name);
        }
    }
}
