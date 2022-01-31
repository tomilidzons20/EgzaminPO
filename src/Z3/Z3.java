package Z3;

import java.io.File;
import java.util.Arrays;

public class Z3 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dirRe("src/162308-E01", ".txt")));
    }

    public static String[] dirRe(String path, String ex){
        File f = new File(path);
        return f.list((p, n) -> n.endsWith(ex));
    }
}
