import java.util.Scanner;

/**
 * Created by ma039102 on 5/12/2016.
 */
public class Main {

    fileManipulation f = new fileManipulation();
    String x = f.getValues();

    public static void main(String[] args) {
        fileManipulation file = new fileManipulation();
        Main m = new Main();

        file.createFile();
        file.getValues();
        file.writeToFile(m.getX());
    }

    public String getX() {


        Scanner userInput = new Scanner(System.in);

        System.out.print("What is your X?: ");
        x = userInput.nextLine();
        return String.valueOf(x);
    }


}
