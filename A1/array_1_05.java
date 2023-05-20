import java.io.*;
import java.util.*;


public class array_1_05 {
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
        int numb = 0;
        int length = inputArray.length-1;
        for (int i = 0; i < length; i++){
            String number = inputArray[i];
            if (data.containsKey(number)){
                    String next_number = inputArray[i+1];
                    //System.out.println(next_number);
                    if (number.equals("hundred") || number.equals("thousand" )|| number.equals("million")){
                        int num = data.get(number);
                        numb *= num;
                        continue;
                    }
                    else if (data.containsKey(next_number)){
                        if (!next_number.equals("hundred") || !next_number.equals("thousand" )|| !next_number.equals("million")){
                            int num = data.get(number);
                            numb += num;
                        }
                        else {
                            int num = data.get(number);
                            int num2 = data.get(next_number);
                            numb += num * num2;
                            i = i+1;
                        }
                    }
            }
            else {
                continue;
            }
        }
        String last_number = inputArray[length];

        if (data.containsKey(last_number)){
            if (last_number.equals("hundred") || last_number.equals("thousand" )|| last_number.equals("million")){
                int num = data.get(last_number);
                numb *= num;
            }
            else {
                int num = data.get(last_number);
                numb += num;
            }
            
        }

        System.out.println(numb);
        input.close();
    }
}
