import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Random rn = new Random();
        ArrayList <Integer> array1 = new ArrayList<>();
        ArrayList <Integer> array2 = new ArrayList<>();
        ArrayList <Integer> array3 = new ArrayList<>();

        for (int i = 0; i < 51; i++) {
            int a = rn.nextInt(1,101);
            array1.add(a);

            if (a%2==0){
                array2.add(a);
            }else if (a%2==1){
                array3.add(a);
            }
        }
        System.out.println("Все"+array1);
        System.out.println("Чет"+array2);
        System.out.println("Нечет"+array3);

    }

}
