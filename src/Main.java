import java.util.stream.IntStream;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] mainArr = new int[30];
        for (int i = 0; i < mainArr.length; i++) {
            mainArr[i] = random.nextInt(100_000) + 100_000;
        }
        return mainArr;
    }

    public static void main(String[] args) {
        generateRandomArray();


        System.out.println("Задача 1");
        int[] mainArr = generateRandomArray();

        int sum = 0;
        for (int element : mainArr) {
            sum += element;
            System.out.println("Сумма трат за месяц составила " + sum);
        }
        //Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        // формате: «Сумма трат за месяц составила … рублей».
        // System.out.println("Сумма трат за месяц составила "+ );


        System.out.println("Задача 2");
        int min = 0;
        int max = 0;
        for (int j : mainArr) {
            if (j > max) max = j;
            System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
            if (j < max) min = j;
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        }


        //Следующая задача — найти минимальную и максимальную трату за день.
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».

        System.out.println("Задача 3");
        double current = 0;
        for (int j : mainArr) {
            current += j / mainArr.length;
            System.out.println("Средняя сумма трат за месяц составила " + current + " рублей");
        }

        //А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        //Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц
        // поделить на количество дней), и вывести в консоль результат в формате:
        // «Средняя сумма трат за месяц составила … рублей».

        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println("");
        char N;
        int n=reverseFullName.length;
        for (int i = 0; i < n/2; i++) {
            N=reverseFullName[n-i-1];
            reverseFullName[n-i-1]=reverseFullName[i];
            reverseFullName[i]=N;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
        //Отойдем от подсчетов.
        //В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О. сотрудников начали отображаться
        // в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем«
        //чивонавИ навИ вонавИ».
        //Данные с именами сотрудников хранятся в виде массива символов (char[]).
        //Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
        // В качестве данных для массива используйте:
        //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //В результате в консоль должно быть выведено "Ivanov Ivan"

    }
}