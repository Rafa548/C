import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class array_1_04 {
    public static void main(String[] args) {
        Map<String, Integer> data = new HashMap<String,Integer>();
        Scanner input = new Scanner(System.in);
        try {
            File file = new File("./bloco1/numbers.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()){
                String number = sc.next();
                sc.next();
                String name = sc.next();
                data.put(name, Integer.parseInt(number));
            }
            sc.close();
        }
        catch (FileNotFoundException e){
            System.err.println("Arquivo não encontrado");
            System.exit(0);
        }
        String line = input.nextLine();
        String[] inputArray = line.split(" ");
        String print = "";
        for (String name : inputArray){
            if (data.containsKey(name)){
                print += data.get(name) + " ";
            }
        }
        System.out.println(print);
        input.close();
    }
}