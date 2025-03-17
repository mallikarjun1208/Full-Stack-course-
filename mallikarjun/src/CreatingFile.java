import java.io.File;
import java.util.Scanner;

public class CreatingFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value");
        String name = sc.next();

        if(name.indexOf(".txt")==-1){
            name += ".txt";
        }
        File file = new File(name);

    try {

        file.createNewFile();
        
    } catch (Exception e) {
       System.out.println("unable resolve this " +name);
    }
    sc.close();
}

}
