import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       while (true) {
           Scanner scanner = new Scanner(System.in);
           System.out.println(calc(scanner.nextLine()));
       }
    }
    public static String calc (String input) throws Exception {
        int rez = 0;
        if (input.contains("+") ){
            String [] numbers = input.split("[+]");
            controlNumber(numbers);
            rez = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        } else if (input.contains("-")){
            String [] numbers = input.split("[-]");
            controlNumber(numbers);
            rez = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
        } else if (input.contains("*")){
            String [] numbers = input.split("[*]");
            controlNumber(numbers);
            rez = Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);
        } else if (input.contains("/")){
            String [] numbers = input.split("[/]");
            controlNumber(numbers);
            rez = Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]);
        } else throw new Exception();
        return String.valueOf(rez);
    }
    static void controlNumber(String[] num) throws Exception {
        if (num.length == 2) {
            for (String number: num) {
                if (Integer.parseInt(number) < 1 || Integer.parseInt(number) > 10 ) {
                    throw new Exception();
                }
            }
        } else throw new Exception();
    }
}
