public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("task1:");
        int i = 123456;
        byte b = 123;
        short s = 1234;
        long l = 1234567890;
        float f = 3.5f;
        double d = 1.4465456464;

        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
    }

    public static void task2 () {
        System.out.println("task2");

        float f = 27.12f;
        long l = 987678965549L;
        double d = 2.786;
        int i = 569;
        short s = -159;
        int i2 = 27897;
        byte b = 67;

        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной d с типом double равно " + d);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i2 с типом int равно " + i2);
        System.out.println("Значение переменной b с типом byte равно " + b);
    }

    public static void task3 () {
        System.out.println("task3");

        int lyudmilaPavlovnaStudents = 23;
        int annaSergeevnaStudents = 27;
        int ekaterinaAndreevaStudents = 30;
        int paperTotal = 480;   // Если считать, что ученику не может достаться только часть листа, то делим на цело. Если же учитывать и частичные листы, то эту переменную меняем на float (по описанию задачи не совсем понятно)
        int totalStudents = lyudmilaPavlovnaStudents + annaSergeevnaStudents + ekaterinaAndreevaStudents;
        int paperPerStudent = paperTotal / totalStudents;   // Тоже поменять на float, если хотим увидеть дробную часть

        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("task4");

        int bottlesPer2Min = 16;
        float bottlesPerMin = bottlesPer2Min / 2f;      // На случай, если машина может произвоить разное количество бутылок за две минуты, учитываем и дробную часть
        float bottlesPer20Min = bottlesPerMin * 20;
        float bottlesPerDay = bottlesPerMin * 60 * 24;
        float bottlesPer3Day = bottlesPerDay * 3;
        float bottlesPerMonth = bottlesPerDay * 30;

        System.out.println("За 20 минут машина произвела " + bottlesPer20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Day + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("task5");

        int jarsTotal = 120;
        int whiteJarsPerRoom = 2;
        int brownJarsPerRoom = 4;
        int totalJarsPerRoom = whiteJarsPerRoom + brownJarsPerRoom;
        int totalRooms = jarsTotal / totalJarsPerRoom;      // Делим на цело учитывая, что по условиям задачи не может быть дробного количества классов
        int whiteJarsTotal = totalRooms * whiteJarsPerRoom;
        int brownJarsTotal = totalRooms * brownJarsPerRoom;

        System.out.println("В школе, где " + totalRooms + " классов, нужно " + whiteJarsTotal + " банок белой краски и " + brownJarsTotal + " банок коричневой краски");
    }

    public static void task6 () {
        System.out.println("task6");

        int bananasWeight = 5 * 80;
        float milkWeight = 105f / 100 * 200;        // Выясняем сколько грамм в миллилитре и умножаем на 200мл
        int iceCreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;
        float weightTotal = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        float weightTotalKg = weightTotal / 1000;

        System.out.println("Всего " + weightTotal + " грамм");
        System.out.println("Всего " + weightTotalKg + " килограмм");
    }

    public static void task7 () {
        System.out.println("task7");

        int needLoseTotalKg = 7;
        int needLoseTotal = needLoseTotalKg * 1000;

        float losePerDayMin = 250f;
        float losePerDayMax = 500f;

        float maxDays = needLoseTotal / losePerDayMin;
        float minDays = needLoseTotal / losePerDayMax;
        float averageDays = (maxDays + minDays) / 2f;

        System.out.println("При потере " + losePerDayMin + " грамм в день, понадобится " + maxDays + " дней");
        System.out.println("При потере " + losePerDayMax + " грамм в день, понадобится " + minDays + " дней");
        System.out.println("В среднем понадобится " + averageDays + " дней");
    }

    public static void task8 () {
        System.out.println("task8");

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        float mashaNewSalary = mashaSalary + mashaSalary * 0.1f;        // Можно и просто умножить на 1.1, но так нагляднее
        float denisNewSalary = denisSalary + denisSalary * 0.1f;
        float kristinaNewSalary = kristinaSalary + kristinaSalary * 0.1f;

        float mashaDelta = mashaNewSalary * 12 - mashaSalary * 12;
        float denisDelta = denisNewSalary * 12 - denisSalary * 12;
        float kristinaDelta = kristinaNewSalary * 12 - kristinaSalary * 12;

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaDelta + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisDelta + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaDelta + " рублей");
    }
}