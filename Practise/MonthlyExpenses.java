package Practise;
/*This program is for storing monthly expenses
* Expenses are stored using ArrayList*/
import java.util.ArrayList;
import java.util.List;

public class MonthlyExpenses {
    public static void main(String[] args) {
        List<Integer> monthlyExpenses = new ArrayList<>();
        monthlyExpenses.add(2200);
        monthlyExpenses.add(2350);
        monthlyExpenses.add(2600);
        monthlyExpenses.add(2130);
        monthlyExpenses.add(2190);
        System.out.println(monthlyExpenses);
        /*Calculating the extra amount spent compare to january*/
        System.out.println(monthlyExpenses.get(1) - monthlyExpenses.get(0));
        /*Calculating the first quarter expenses i.e first three months*/
        System.out.println(monthlyExpenses.get(0)+monthlyExpenses.get(1)+monthlyExpenses.get(2));
        /*Checking if any monthly expense is equal to 2000*/
        for (int i=0; i<monthlyExpenses.toArray().length ; i++){
            if (monthlyExpenses.get(i) == 2000){
                System.out.println(monthlyExpenses.get(i));
            }
        }
        /*Adding one more element to the list*/
        monthlyExpenses.add(1980);
        System.out.println(monthlyExpenses);
        /*Calculating the April month expense after refund of 200*/
        System.out.println(monthlyExpenses.get(3) - 200);


    }
}
