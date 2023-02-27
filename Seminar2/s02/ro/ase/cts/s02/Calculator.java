package ro.ase.cts.s02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    /**
     * Aceasta metoda calculeaza suma dintre x ridicat la puterea a-5a si y ridicat la putearea a-7a.
     * @return Returneaza rezultatul calculat.
     * @throws IOException Arunca exceptie daca datele introduse nu au formatul corect.
     */
   public static double power(double N, int P)
    {
        int pow = 1;
        for (int i = 1; i <= P; i++)
            pow *= N;
        return pow;
    }
    public double Xpow5PlusYpow7() throws IOException {
       try{
           double result = 0.0;
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Tastati valoarea pentru X:");
           double x = Double.parseDouble(reader.readLine());

           System.out.println("Tastati valoarea pentru Y:");
           double y = Double.parseDouble(reader.readLine());
           result=power(x,5)+power(y,7);
           return result;
       }
       catch(NumberFormatException exception){
           System.out.println(exception.getMessage());
           return -1;
        }


        /*double x5 = x;
        for (int i = 1; i < 5; i++) {
            x5 *= x;
        }

        double y7 = y;
        for (int i = 1; i < 7; i++) {
            y7 *= y;
        }*/

        //result = power(x, 5)+power(y,7);

    }


}

//exceptia aruncata trebuie modificata/tratata si cealalta exceptie
//in cazul valorilor non numerice se reia procesul de citire
//metoda separata pentru calculul ridicarii la putere
//denumire metoda
//