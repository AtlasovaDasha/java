import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception {
        Integer result=0;
        String[] rimskie_mass = new String[] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        String[] arab_mass = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        String[] operators = new String[] {"+", "-", "*", "/"};

        List rimskie_list = new ArrayList<>(Arrays.asList(rimskie_mass));
        List arab_list = new ArrayList<>(Arrays.asList(arab_mass));

        List operators_list = new ArrayList<>(Arrays.asList(operators));

        Scanner scanner = new Scanner(System.in);

        String task = scanner.nextLine();

        String[] task_array = task.split(" ");
        if (task_array.length != 3){
            throw new Exception();
        }

        if (!((rimskie_list.contains(task_array[0]) && rimskie_list.contains(task_array[2])) || (arab_list.contains(task_array[0]) && arab_list.contains(task_array[2])))){
            throw new Exception();
        }

        boolean arab; // Arab - True
        arab = arab_list.contains(task_array[0]);

        if (!(operators_list.contains(task_array[1]))){
            throw new Exception();
        }

        Integer operand_1;
        Integer operand_2;
        if (arab){
            operand_1 = Integer.parseInt(task_array[0]);
            operand_2 = Integer.parseInt(task_array[2]);
        } else{
            operand_1 = rimskie_list.indexOf(task_array[0]) + 1;
            operand_2 = rimskie_list.indexOf(task_array[2]) + 1;
        }


        if (task_array[1].equals("+")){
            result = operand_1 + operand_2;
        } else if (task_array[1].equals("-")){
            result = operand_1 - operand_2;
        } else if (task_array[1].equals("*")){
            result = operand_1 * operand_2;
        } else if (task_array[1].equals("/")) {
            result = operand_1 / operand_2;
        }
        if (arab){
            System.out.println(result);
        } else {
            System.out.println(convert(result));
        }


    }

    public static String romanDigit(int n, String one, String five, String ten){

        if(n >= 1)
        {
            if(n == 1)
            {
                return one;
            }
            else if (n == 2)
            {
                return one + one;
            }
            else if (n == 3)
            {
                return one + one + one;
            }
            else if (n==4)
            {
                return one + five;
            }
            else if (n == 5)
            {
                return five;
            }
            else if (n == 6)
            {
                return five + one;
            }
            else if (n == 7)
            {
                return five + one + one;
            }
            else if (n == 8)
            {
                return five + one + one + one;
            }
            else if (n == 9)
            {
                return one + ten;
            }

        }
        return "";
    }

    public static String convert(int number){

        String romanOnes = romanDigit( number%10, "I", "V", "X");
        number /=10;
        String romanTens = romanDigit( number%10, "X", "L", "C");
        number /=10;
        String romanHundreds = romanDigit(number%10, "C", "D", "M");
        number /=10;
        String romanThousands = romanDigit(number%10, "M", "", "");

        String result = romanThousands + romanHundreds + romanTens + romanOnes;
        return result;

    }
}
