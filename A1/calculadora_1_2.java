import java.util.Scanner;
import java.util.HashMap;

public class calculadora_1_2 {

    public static void main(String[] args) {
        HashMap <String, Double> variaveis = new HashMap <String, Double>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Calculo desejado: ");
        String calculo = sc.nextLine();
        String[] calculoSeparado = calculo.split(" ");
        
        if (calculoSeparado[0].matches("[a-zA-Z]+") && calculoSeparado[1].equals("=")) {
            variaveis.put(calculoSeparado[0], Double.parseDouble(calculoSeparado[2]));
        }
        else {
            double num1 = Double.parseDouble(calculoSeparado[0]);
            double num2 = Double.parseDouble(calculoSeparado[2]);
            String operacao = calculoSeparado[1];
            double resultado = 0;
            switch (operacao) {
                case "+":
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "-":
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "*":
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "/":
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                    break;  
                default:
                    System.err.println("Operação inválida");
                    break;
            }
        }
        
    
    }
        
}

