package by.epam.Unit01.Homeworks;

import java.util.Scanner;

public class Homework01 {

    public static void task01() {

        //1. Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное

        int x, y; // два действительных числа
        int z; // сумма
        int m;
        int n;
        double l;

        x = 546;
        y = 236;

        // Сумма  x and y
        z = x + y;
        System.out.println("Сумма чисел z = " + z);

        // Разность
        m = x - y;
        System.out.println("Разность чисел m = " + m);

        // Произведение
        n = x * y;
        System.out.println("Произведение чисел n = " + n);

        // Частное
        l = x / y;
        System.out.println("Частное чисел l = " + l);

    }

    public static void task02() {

        //2. Найдите значение функции: с = 3 + а.

        int a; //неизвестная функции
        int c; // результат функции

        Scanner sc = new Scanner(System.in);

        System.out.print("> ");

        a = sc.nextInt();

        c = 3 + a;

        System.out.println("3 + a = " + c);

    }

    public static void task03() {

        //3. Найдите значение функции: z = 2 * x + ( y – 2 ) * 5.

        double x, y; //неизвестные функции
        double z; // результат функции

        Scanner sc = new Scanner(System.in);

        System.out.print("введите x >");
        x = sc.nextDouble();

        System.out.print("введите y >");
        y = sc.nextDouble();

        z = 2 * x + (y - 2) * 5;

        System.out.println("Результат функции z = " + z);

    }

    public static void task04() {

        // Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

        double a, b, c; //неизвестные функции
        double b05, a3;

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите значение a >");
        a = sc.nextDouble();

        System.out.print("Введите значение b >");
        b = sc.nextDouble();

        System.out.print("Введите значение c >");
        c = sc.nextDouble();

        a3 = a - 3;
        b05 = b / 2;

        // результат функции
        double z = (a3 * b05) + c;

        System.out.println("Результат функции z = " + z);
    }

    public static void task05() {

        // Составить алгоритм нахождения среднего арифметического двух чисел

        int a, b; //неизвестные функции
        double srednee; // среднеарифметическое

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите значение a >");
        a = sc.nextInt();

        System.out.print("Введите значение b >");
        b = sc.nextInt();

        // результат функции
        srednee = (a + b) / 2.0;

        System.out.println("Среднеарифметическое чесел a и b = " + srednee);
    }

    public static void task06() {

        /*6. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах,
        если в каждом большом бидоне на 12 л. больше, чем в малом?*/

        int n, m; //неизвестное количество бидонов
        double y; // количество молоко во всех больших бидонах

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество бидонов n >");
        n = sc.nextInt();

        System.out.print("Введите количество бидонов m >");
        m = sc.nextInt();

        y = (80 / n + 12.0) * m;

        System.out.println("В " + m + " больших бидонах " + y + " литров молока");
    }

    public static void task07() {

        //7. Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника

        double a; //длина прямоугольника

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Please enter a positive width value: >");
            while (!sc.hasNextDouble()) {
                sc.next();
                System.out.print("That not a positive number! Please enter positive width value : > ");
            }
            a = sc.nextDouble();
        } while (a <= 0);

        double b = a / 2; // ширина прямоугольника

        double S = a * b; // площадь прямоугольника

        System.out.println("Area of the rectangle = " + S);

    }

    public static void task08() {

        //8. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

        int a = 35;
        int b = 43;
        int c = 26;

        double x; // значение выражения

        double d = Math.sqrt((b * b) + 4 * a * c);

        x = ((b + d) / (2.0 * a)) - (Math.pow(a, 3) * c) + Math.pow(b, -2);

        System.out.println("x = " + x);
    }

    public static void task09() {

        //9. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

        double a = 35;
        double b = 43;
        double c = 26;
        double d = 274;

        double x; // значение выражения

        x = (a / c * b / d) - ((a * b - c) / c * d);

        System.out.println("x = " + x);
    }

    public static void task10() {

        //10. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

        int x = 180; // х = 180 градусов
        int y = 90; // y = 90 градусов

        double z; // значение выражения

        double sinx = Math.sin(Math.toRadians(x));
        double cosy = Math.cos(Math.toRadians(y));
        double cosx = Math.cos(Math.toRadians(x));
        double siny = Math.sin(Math.toRadians(y));
        double tgxy = Math.tan(Math.toRadians(y) * Math.toRadians(x));

        z = (sinx + cosy) / (cosx - siny) * tgxy;

        System.out.println("z = " + z);
    }

    public static void task11() {

        //11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.

        double a = 12.6; // длина катета а
        double b = 358; // длина катета b

        double c; // длина гипотенузы

        c = Math.sqrt(a * a + b * b);

        double P; // периметр треугольника

        P = a + b + c;
        System.out.println("Периметр = " + P);

        double S; // площадь треугольника

        S = (a * b / 2.0);
        System.out.println("Площадь = " + S);

    }

    public static void task12() {

        //12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).

        int x1 = 3, y1 = -3; // координаты точки 1
        int x2 = -4, y2 = 5; // координаты точки 2

        double otr; // длина отрезка (она же будет гипотенузой)

        int kat1; // расстояние между точками 1 и 2 на проекцию оси х
        int kat2; // драсстояние между точками 1 и 2 на проекцию оси y

        kat1 = Math.abs(x1 - x2);
        System.out.println(kat1);

        kat2 = Math.abs(y1 - y2);
        //System.out.println(kat2);

        otr = Math.sqrt(Math.pow(kat1, 2) + Math.pow(kat2, 2));
        System.out.println("Длина отрезка = " + otr);

    }

    public static void task13() {

        //13. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.

        int x1 = 3, y1 = 4; // координаты точки 1
        int x2 = -2, y2 = -1; // координаты точки 2
        int x3 = 2, y3 = -4; // координаты точки 3

        double otr12; // длина отрезка между точками 1 и 2;
        double otr13; // длина отрезка между точками 1 и 3;
        double otr23; // длина отрезка между точками 2 и 3;

        double P; // Периметр треугольника
        double p; // Полупериметр треугольника

        double S; // площадь треугольника

        // Определяем длины отрезка между точками 1 и 2;

        int kat12; // расстояние между точками 1 и 2 на проекцию оси х
        int kat21; // расстояние между точками 1 и 2 на проекцию оси y

        kat12 = Math.abs(x1 - x2);
        kat21 = Math.abs(y1 - y2);

        otr12 = Math.sqrt(Math.pow(kat12, 2) + Math.pow(kat21, 2));
        System.out.println("Длина отрезка otr12 = " + otr12);

        // Определяем длины отрезка между точками 3 и 1;

        int kat13; // расстояние между точками 3 и 1 на проекцию оси х
        int kat31; // расстояние между точками 3 и 1 на проекцию оси y

        kat13 = Math.abs(x1 - x3);
        kat31 = Math.abs(y1 - y3);

        otr13 = Math.sqrt(Math.pow(kat13, 2) + Math.pow(kat31, 2));
        System.out.println("Длина отрезка otr13 = " + otr13);

        // Определяем длины отрезка между точками 2 и 3;

        int kat23; // расстояние между точками 2 и 3 на проекцию оси х
        int kat32; // расстояние между точками 2 и 3 на проекцию оси y

        kat23 = Math.abs(x2 - x3);
        kat32 = Math.abs(y2 - y3);

        otr23 = Math.sqrt(Math.pow(kat23, 2) + Math.pow(kat32, 2));
        System.out.println("Длина отрезка otr23 = " + otr23);

        // Определяем периметр треугольника

        P = otr12 + otr13 + otr23;
        System.out.println("Периметр треугольника = " + P);

        // Определяем площадь треугольника по формуле Герона

        p = (otr12 + otr13 + otr23) / 2.0;

        S = Math.sqrt(p * (p - otr12) * (p - otr13) * (p - otr23));
        System.out.println("Площадь треугольника = " + S);

    }

    public static void task14() {

        //14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.

        double R = 150.0; // радиус окружности в мм;

        double L; // длина окружности, мм

        double S; // площадь круга, мм2

        // Определяем длину окружности

        L = 2.0 * Math.PI * R;
        System.out.println("Длина окружности L = " + L + " мм");

        // Определяем площадь круга

        S = Math.PI * Math.pow(R, 2);
        System.out.println("Площадь круга S = " + S + " мм2");

    }

    public static void task15() {

        //15. Написать программу, которая выводит на экран первые четыре степени числа π.

        int i = 1;

        while (i < 6) {
            System.out.println("i" + i + "= " + Math.pow(Math.PI, i));
            i++;
        }

    }

    public static void task16() {

        //16. Найти произведение цифр заданного четырехзначного числа.

        int x = 1236;

        int sum = 0;

        int num;

        while (x > 0) {
            num = x % 10;
            sum = sum + num;
            x = x / 10;
        }
        System.out.println(sum);

    }

    public static void task17() {

        //17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.

        int a, b; //неизвестные функции

        double srdar; // среднеарифметическое

        double srdgeo; // Среднее геометрическое

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите значение a >");
        a = sc.nextInt();

        System.out.print("Введите значение b >");
        b = sc.nextInt();

        srdar = (a + b) / 2.0;
        System.out.println("Среднеарифметическое чесел a и b = " + srdar);

        srdgeo = Math.sqrt(a * b);
        System.out.println("Среднее геометрическое чесел a и b = " + srdgeo);

    }

    public static void task18() {

        //18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.

        int l = 10; // длина ребра куба;

        double p; // площадь грани куба;

        double P; // площадь полной поверхности куба;

        double V; // объем куба;

        p = l * l;
        System.out.println("Площадь грани куба p = " + p);

        P = p * 6;
        System.out.println("Площадь полной поверхности куба P = " + P);

        V = Math.pow(l, 3);
        System.out.println("Объем куба V = " + V);
    }

    public static void task19() {

        //19. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.

        int a = 5; // длина стороны равностороннего треугольника

        double S; // площадь треугольника

        double h; // высота треугольника

        double r; // радиус вписанной окружности
        double R; // радиус описанной окружности

        h = Math.sqrt(3) / 2 * a;
        System.out.println("Высота треугольника h = " + h);

        S = a * h / 2.0;
        System.out.println("Площадь треугольника S = " + S);

        r = a / (2 * Math.sqrt(3));
        System.out.println("Радиус вписанной окружности r = " + r);

        R = a / Math.sqrt(3);
        System.out.println("Радиус описанной окружности R = " + R);

    }

    public static void task20() {

        //20. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.

        int l = 26; // длина окружности

        double S; // площадь круга

        double R; // радиус окружности

        R = l / (2.0 * Math.PI);

        S = Math.PI * Math.pow(R, 2);
        System.out.println("Площадь круга S = " + S);

    }

    public static void task21() {

        //21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа.

        double R = 111.222;

        int nnn;

        nnn = (int) R;
//        System.out.println(nnn);

        double ddd;

        ddd = R * 1000 - nnn * 1000;
//        System.out.println(tail);

        double Rev;

        Rev = ddd;

        Rev = Rev + nnn * 0.001;

        System.out.println(Rev);

    }

    public static void task22() {

        //22. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
        //Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.

        int T = 4830;

        int HH;
        int MM;
        int SS;

        HH = T / 3600;
        //System.out.println(HH);

        MM = (T - HH * 3600) / 60;
        //System.out.println(MM);

        SS = T - (HH * 3600) - (MM * 60);
        //System.out.println(SS);

        System.out.println(T + " секунд - это " + HH + "ч " + MM + "мин " + SS + "с");

    }

    public static void task23() {

        //23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).

        int r = 15; // внутренний радиус окружности

        int R = 20; // внешний радиус окружности

        double S; // площадь кольца;

        S = Math.PI * (R * R - r * r);
        System.out.println("Площадь кольца S = " + S);
    }

    public static void task24() {

        //24. Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.

        double a = 215.5; // длина большего основания
        double b = 100.0; // длина меньшего основания

        double ang = 30;

        double sinang = Math.sin(Math.toRadians(ang));
        double cosang = Math.cos(Math.toRadians(ang));

        double c; // длина боковой стороны

        c = (a - b) / (2 * cosang);
        // System.out.println(c);

        double S; // площадь равнобедренной трапеции через стороны и угол

        S = c * sinang * (a - c * cosang);
        System.out.println("Площадь равнобедренной трапеции S = " + S);

    }

    public static void task25() {

        //25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с (предполагается, что а≠0 и что дискриминант уравнения неотрицателен).

        int a = 2;
        int b = 10;
        int c = 3;

        double D; // дискриминат

        D = Math.pow(b, 2) - 4 * a * c;
        //System.out.println(D);

        double x1, x2; // искомые корни уравнения

        x1 = (-b + Math.sqrt(D)) / (2 * a);
        System.out.println("x1 = " + x1);

        x2 = (-b - Math.sqrt(D)) / (2 * a);
        System.out.println("x2 = " + x2);

    }

    public static void task26() {

        //26. Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.

        int a = 25;

        int b = 50;

        int y = 45;

        double siny = Math.sin(Math.toRadians(y));

        double S; // Площадь треугольника;

        S = ((a * b / 2.0) * siny);
        System.out.println("Площадь треугольника S = " + S);

    }

    public static void task27() {

        //27. Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а8 за три операции и а10 за четыре операции.

        int a = 2;

        double x;

        double a2, a4, a8, a10;

        x = Math.pow(a, 10);

        a2 = a *a;

        a4 = a2 * a2;

        a8 = a4 * a4;

        a10 = a8 * a2;

        System.out.println("a8 = " +a10 + " and a10 = " + a10);
    }

    public static void task28() {

        //28. Составить программу перевода радианной меры угла в градусы, минуты и секунды.

        double rad = 1.0;

        int degree; // градусы

        int min; // минуты

        double sec; // секунды

        double drg;

        drg = Math.toDegrees(rad);
        degree = (int)drg;
//        System.out.println(degree);

        double min1;

        min1 = (drg - degree) * 60;
        min = (int)min1;
//        System.out.println(min);

        sec = (min1 - min) * 60;
//        System.out.println(sec);
        System.out.println(rad + " радиан - это " + degree + "*" + min + "'" + sec + "''");

    }

    public static void task29() {

        //29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.

        int a = 14;
        int b = 10;
        int c = 12;

        double cosab; // cos угла между сторономи a и b;

        double cosbc; // cos угла между сторономи b и c;

        double cosac; // cos угла между сторономи a и c;

        cosab = ((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));

        cosbc = ((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c));

        cosac = ((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c));

        double ab; // угол между сторонами a и b в радианах
        double bc; // угол между сторонами b и c в радианах
        double ac; // угол между сторонами a и c в радианах

        ab = Math.acos(cosab);
        System.out.println("Угол между сторонами a и b равен " + ab + " радиан или " + Math.toDegrees(ab) + " градусов.");

        bc = Math.acos(cosbc);
        System.out.println("Угол между сторонами a и b равен " + bc + " радиан или " + Math.toDegrees(bc) + " градусов.");

        ac = Math.acos(cosac);
        System.out.println("Угол между сторонами a и b равен " + ac + " радиан или " + Math.toDegrees(ac) + " градусов.");

    }

    public static void task30() {

        //30. Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.

        double R1 = 2;
        double R2 = 4;
        double R3 = 6;

        double Rn;

        Rn = (R1 * R2 * R3) / (R1 + R2 + R3);

        System.out.println("Rn = " + Rn);

    }

    public static void task31() {

        /*31. Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч,
              скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч.*/

        float V = 35;

        float V1 = 5;

        double t1 = 1.5;

        double t2 = 0.8;

        double S1;

        S1 = (V / t1) + ((V - V1) / t2);

        float S = (float) S1;

        System.out.println("Расстояние пройденное лодкой S = " + S + " км.");

    }

    public static void task32() {

        /*32. Текущее показание электронных часов: m ч (0 ≤ т ≤23), n мин (0 ≤ п ≤59), k с (0 ≤к ≤59).
        Какое время будут показывать часы через р ч, q мин, r с?*/

        // Текущее время

        int m = 23;

        int n = 58;

        int k = 55;

        // Промежуток времени

        int p = 26;

        int q = 65;

        int r = 70;

        // Что будут показывать часы

        int HH = m + p;

        int mm = n + q;

        int ss = k + r;

        while (HH > 23) {

            HH = HH - 24;
        }

        while (mm > 59) {

            mm = mm - 60;
        }

        while (ss > 59) {

            ss = ss - 60;
        }

        System.out.println(HH + " HH " + mm + " mm " + ss + " ss");

    }

    public static void task33() {

        // 33. Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.

        //  ненашел понимания, что это за таск и как его выполнить

    }

    public static void task34() {

        //34. Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации.

        byte A = 127;
        System.out.println(A);

        float B = A;
        System.out.println(B);

    }

    public static void task35() {

        //35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.

        double M = 658;

        double N = 6694;

        double MN = M / N;
        System.out.println(MN);

        int x = (int) (MN * 10);

        double y = (x % 100) / 10.0;
        System.out.println(y);

    }

    public static void task36() {

        //36. Найти частное произведений четных и нечетных цифр четырехзначного числа.

        int N = 15874;

        double mult1 = 1; // Произведение нечетных цифр
        double mult2 = 1; // Произведение четных цифр
        double num;

        while (N > 0) {
            num = N % 10;
            if (num % 2 == 0) {
                mult2 = mult2 * num;
            } else
                mult1 = mult1 * num;
            N = N / 10;

        }
        System.out.println("Произведение нечетных цифр = " + mult1);
        System.out.println("Произведение четных цифр = " + mult2);

        double chastnoe;

        chastnoe = mult2 / mult1;
        System.out.println("Частное произведений четных и нечетных цифр = " + chastnoe);
    }

    public static void task37() {

        //37. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:

        //1) Целое число N является четным двузначным числом.

        int N1 = 31;

        System.out.println("1) Целое число " + N1 + " является четным двузначным?");

        if (N1 > 9 && N1 < 100 && (N1 % 2 == 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // 2) Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.

        int N2 = 1234;

        int n2 = N2;

        int sum12 = 0, sum34 = 0;

        int num;

        num = n2 % 10;
        sum34 = sum34 + num;
        n2 = n2 / 10;

        num = n2 % 10;
        sum34 = sum34 + num;
        n2 = n2 / 10;

        num = n2 % 10;
        sum12 = sum12 + num;
        n2 = n2 / 10;

        num = n2 % 10;
        sum12 = sum12 + num;
        n2 = n2 / 10;

        System.out.println("2) Сумма двух первых цифр заданного четырехзначного числа " + N2 + " равна сумме двух его последних цифр?");
        if (sum12 == sum34)
            System.out.println("true");
        else
            System.out.println("false");

        //3) Сумма цифр данного трехзначного числа N является четным числом.

        int N3 = 123;
        int n3 = N3;

        double sum3 = 0;
        double num3;

        System.out.println("3) Сумма цифр данного трехзначного числа " + N3 + " является четным числом?");

        while (n3 > 0) {
            num3 = n3 % 10;
            sum3 = sum3 + num3;
            n3 = n3 / 10;
        }
        if (sum3 % 2 == 0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //4) Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п).

        int x, y;

        x = 2;
        y = 3;

        int m, n;

        n = 5;
        m = 3;

        System.out.println("4) Точка с координатами x = " + x + " и y = " + y + " принадлежит части плоскости, лежащей между прямыми х = " + m + " , х = " + n + " ?");

        if (x >= m && x <= n)
            System.out.println("true");
        else
            System.out.println("false");

        // 5) Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.

        int N5 = 548;

        int n5 = N5;

        double sum5 = 0;

        while (n5 > 0) {
            double num5 = n3 % 10;
            sum5 = sum5 + num5;
            n5 = n5 / 10;
        }

        System.out.println("5) Квадрат заданного трехзначного числа " + N5 + " равен кубу суммы цифр этого числа?");

        if (Math.pow(N5, 2) == Math.pow(sum5, 3))
            System.out.println("true");
        else
            System.out.println("false");

        // 6) Треугольник со сторонами а,b,с является равнобедренным.

        int a6 = 4;
        int b6 = 4;
        int c6 = 3;

        System.out.println("6) Треугольник со сторонами а,b,с равными " + a6 + ", " + b6 + ", " + c6 + " является равнобедренным?");

        if (a6 == b6 || a6 == c6 || b6 == c6)
            System.out.println("true");
        else
            System.out.println("false");

        // 7) Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.

        int N7 = 123;

        int n7 = N7;

        int num73; // третья цифра

        num73 = n7 % 10;

        n7 = n7 / 10;
//        System.out.println(num73);

        int num72; // вторая цифра

        num72 = n7 % 10;

        n7 = n7 / 10;
//        System.out.println(num72);

        int num71; // первая цифра

        num71 = n7 % 10;
//        System.out.println(num71);

        System.out.println("7) Сумма каких-либо двух цифр заданного трехзначного натурального числа " + N7 + " равна третьей цифре?");

        if (((num71 + num72) == num73) || ((num71 + num73) == num73) || ((num73 + num72) == num73))
            System.out.println("true");
        else
            System.out.println("false");

        // 8) Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).

        int N8 = 8;

        int a8 = 8;

        System.out.println("8) Заданное число " + N8 + " является степенью числа а " + a8 + " ?");

        if (a8 == Math.pow(N8, 0) || a8 == N8 || a8 == Math.sqrt(N8) || a8 == Math.pow(N8, 3) || a8 == Math.pow(N8, 4))
            System.out.println("true");
        else
            System.out.println("false");

        // 9) График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п).

        int a9, b9, c9;

        a9 = 2;
        b9 = 3;
        c9 = 4;

        int m9 = 2;
        double n9 = 4;

        System.out.println("9) График функции у = ах2 + bх+ с проходит через заданную точку с координатами m = " + m + ", n = " + n);

        if (n9 == (a9 * m9 * m9 + b9 * m9 + c9))
            System.out.println("true");
        else
            System.out.println("false");

    }

    public static void task38() {

        //38. Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае.

        int x, y;

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите x: >");
        x = sc.nextInt();

        System.out.print("Введите y: >");
        y = sc.nextInt();

        //а) Решение для фигуры а (треугольник);

//        int ax1 = 4;
//        int ax2 = -4;
//        int ay1 = 0;
//        int ay2 = 4;

        if (((-4 <= x) && (x <= 4) && (y == 0)) || ((0 <= y) && (y <= 4) && (x == 0))) {
            System.out.println("Для фигуры а) - true");
        } else if ((-3 <= x) && (x <= 3) && (y == 1)) {
            System.out.println("Для фигуры а) - true");
        } else if ((-2 <= x) && (x <= 2) && (y == 2)) {
            System.out.println("Для фигуры а) - true");
        } else if ((-1 <= x) && (x <= 1) && (y == 3)) {
            System.out.println("Для фигуры а) - true");
        } else
            System.out.println("Для фигуры а) - false");

        //b) Зададим кординаты фигуры b и проверим условия.

        int bx1 = 4;
        int bx2 = 2;
        int bx3 = -2;
        int bx4 = -4;
        int by1 = 4;
        int by0 = 0;
        int by2 = -3;

        if ((bx4 <= x) && (x <= bx1) && (by2 <= y) && (y <= by0)) {
            System.out.println("Для фигуры b) - true");
        } else if ((bx3 <= x) && (x <= bx2) && (by0 <= y) && (y <= by1)) {
            System.out.println("Для фигуры b) - true");
        } else
            System.out.println("Для фигуры b) - false");

        //c) Зададим радиусы фигуры c и проверим условия.

        int R1 = 4;
        int R2 = 5;

        if ((x * x + y * y <= R2 * R2) && (R2 >= x)  && (x >= 0) && (y >= -R2) && (y <= 0)) {
            System.out.println("Для фигуры c) - true");
        } else if ((x * x + y * y <= R1 * R1) && (R1 >= x)  && (x >= 0) && (R1 >= y) && (y >= 0)) {
            System.out.println("Для фигуры c) - true");
        } else
            System.out.println("Для фигуры c) - false");

    }

    public static void task39() {

        //39*. Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения, сложения и вычитания, вычислите за минимальное число операций:
        //2x4 - 3х3 + 4х2 - 5х + 6.

        int x = 3;

        //double y = (2 * Math.pow(x, 4)) - (3 * Math.pow(x, 3)) + (4 * Math.pow(x, 2)) - (5 * x) + 6;

        double x2 = x * x;
        double x3 = x2 * x;
        double x4 = x2 * x2;

        double y = 2 * x4 - 3 * x3 + 4 * x2 - 5 * x + 6;

        System.out.println("y = " + y);

    }

    public static void task40() {

        //40*. Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии операций.

        int x = 3;

//        double y = (-2 * x + (3 * x * x) - 4 * x * x * x);
//        double z = (1 + 2 * x + 3 * x * x + 4 * x * x * x);
//        System.out.println(y + " + " + z);

        double x2 = x * x;
        double x3 = x2 * x;

        double y1, y2;

        y1 = (-2 * x + 3 * x2 - 4 * x3);
        y2 = (1 + 2 * x + 3 * x2 + 4 * x3);

        System.out.println("y1 = " + y1);
        System.out.println("y2 = " + y2);

    }

}

