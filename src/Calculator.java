import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author El Baron 22.07.2024
 */
public class Calculator {
    public static void main(String[] args) {
        double firstNum;
        do {
            System.out.println("Введите первое число:");
            try {
                firstNum = new Scanner(System.in).nextDouble();
            } catch (InputMismatchException exception) {
                System.out.println("Введено неподходящее значение");
                continue;
            }
            break;
        } while (true);

        System.out.println("Введите необходимый оператор(+ - / *)");
        String operator = new Scanner(System.in).nextLine();

        double secondNum;
        do {
            System.out.println("Введите второе число:");
            try {
                secondNum = new Scanner(System.in).nextDouble();
            } catch (InputMismatchException exception) {
                System.out.println("Введено неподходящее значение");
                continue;
            }
            break;
        } while (true);

        double answer;


        switch (operator) {
            case "+":
                answer = firstNum + secondNum;
                System.out.println(firstNum + " + " + secondNum + " = " + answer);
                break;
            case "-":
                answer = firstNum - secondNum;
                System.out.println(firstNum + " - " + secondNum + " = " + answer);
                break;
            case "/":
                answer = firstNum / secondNum;
                System.out.println(firstNum + " / " + secondNum + " = " + answer);
                break;
            case "*":
                answer = firstNum * secondNum;
                System.out.println(firstNum + " * " + secondNum + " = " + answer);
                break;

        }
    }
}

