import java.util.Scanner;
import java.util.HashMap;

public class calculadora_1_2 {

    public static void main(String[] args) {
        HashMap <String, Double> variaveis = new HashMap <String, Double>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Calculo desejado: ");
        //String calculo = sc.nextLine();
        //String[] calculoSeparado = calculo.split(" ");
        int counter = 0;

        while (sc.hasNext()){
            String elemento = sc.next();
            if (elemento.matches("[a-zA-Z]+") && sc.next().equals("=")) {
                try {
                    double num = Double.parseDouble(sc.next());
                    if (variaveis.containsKey(elemento)) {
                        String operacao = sc.next();
                        double num2 = Double.parseDouble(sc.next());
                        double resultado = 0;
                        switch (operacao) {
                            case "+":
                                resultado = num + num2;
                                variaveis.replace(elemento, resultado);
                                break;
                            case "-":
                                resultado = num - num2;
                                variaveis.replace(elemento, resultado);
                                break;
                            case "*":
                                resultado = num * num2;
                                variaveis.replace(elemento, resultado);
                                break;
                            case "/":
                                resultado = num / num2;
                                variaveis.replace(elemento, resultado);
                                break;  
                            default:
                            variaveis.replace(elemento, resultado);
                                break;
                        }
                    }
                    else {
                        variaveis.put(elemento, num);
                    }
                 }
                 catch (NumberFormatException e) {
                     System.err.println("Valor inválido");
                     continue;
                 }
            }
            else if (elemento.matches("[a-zA-Z]+")) {
                String operacao = sc.next();
                double num2 = Double.parseDouble(sc.next());
                double resultado = 0;
                switch (operacao) {
                    case "+":
                        resultado = variaveis.get(elemento) + num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case "-":
                        resultado = variaveis.get(elemento) - num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case "*":
                        resultado = variaveis.get(elemento) * num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case "/":
                        resultado = variaveis.get(elemento) / num2;
                        System.out.println("Resultado: " + resultado);
                        break;  
                    default:
                        System.err.println("Operação inválida");
                        break;
                }
            }
            else {
                double num1 = Double.parseDouble(elemento);
                String operacao = sc.next();
                double num2 = Double.parseDouble(sc.next());
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
        sc.close();
    }
        
}

