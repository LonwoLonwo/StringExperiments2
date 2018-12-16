import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    public static void main(String[] args) throws IOException {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        //Вариант 1. На случай, когда известо, в каком именно месте строки находятся числа
        String fragments[] = text.split("\\s+");

        int fr10 = Integer.parseInt(fragments[2]);
        System.out.println("Вася заработал: " + fr10);
        int fr11 = Integer.parseInt(fragments[6]);
        System.out.println("Петя заработал: " + fr11);
        int fr12 = Integer.parseInt(fragments[11]);
        System.out.println("Маша заработала: " + fr12);
        int sum = fr10 + fr11 + fr12;

        System.out.println("Общий заработок: " + sum);

        System.out.println();

        //Вавриант 2. Направлен только на поиск чисел.
        String fragments2[] = text.split("\\W+");

        int fr20 = Integer.parseInt(fragments2[1]);
        System.out.println("Вася заработал: " + fr20);
        int fr21 = Integer.parseInt(fragments2[2]);
        System.out.println("Петя заработал: " + fr21);
        int fr22 = Integer.parseInt(fragments2[3]);
        System.out.println("Маша заработала: " + fr22);
        int sum2 = fr20 + fr21 + fr22;

        System.out.println("Все вмести заработали: " + sum2);

        System.out.println();

        //Разбивка ФИО
        System.out.println("Введите Фамилию Имя Отчество: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String readString = reader.readLine();
        String fragments3[] = readString.split("\\s+");

        /*Pattern pattern = Pattern.compile("[А-ЯЁ][а-яё]+");

        Matcher matcher = pattern.matcher(readString);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(readString.substring(start, end));
        }*/

        System.out.println("Фамилия: " + fragments3[0]);
        System.out.println("Имя: " + fragments3[1]);
        System.out.println("Отчество: " + fragments3[2]);

    }
}