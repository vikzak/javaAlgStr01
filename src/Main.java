import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*Если мы перечислим все натуральные числа ниже 10, которые кратны 3 или 5, мы получим 3, 5, 6 и 9. Сумма этих кратных составляет 23.
        Найдите сумму всех кратных 3 или 5 ниже 1000.*/
        int k3 = 0;
        int k5 = 0;
        int numb = 1000;
        while (numb > 0){
            numb--;
            if (numb%3 == 0) k3 = k3+ numb;
            if (numb%5 == 0) k5 = k5+ numb;
        }
        System.out.printf("Сумма чисел кратных 3=%s, кратных 5=%s (включая 0/3 и 0/5)", k3,k5);

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));    // Чтение с консоли
        int n = Integer.parseInt(reader.readLine());    // Получаем число N
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Сейчас сумма равна " + sum + ", а складывать будем с " + i);    // Эту строку можно удалить
            sum = sum + i;
            System.out.println("Сумма чисел после работы тела цикла " + sum);   // Эту строку можно удалить
        }
        System.out.println("Итог работы цикла " + sum);

    }

}
