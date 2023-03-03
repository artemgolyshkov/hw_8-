public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
         int salary = 15_000;
         int total = 0;
         int i = 0;
         while (total < 2_459_000) {
            total = total + total/100;
            total = total + salary;
            i = i + 1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача 2");
         int start = 1;
         while (start <= 10) {
            System.out.print (start + " ");
            start = start + 1;
        }
        System.out.println();
         for (int w = 10; w > 0; w = w - 1) {
            System.out.print(w + " ");
        }
        System.out.println();
        System.out.println("Задача 3");
         int y = 12_000_000;
         int born = 17;
         int dead = 8;
         int totalOneYeer = ((born - dead) * y)/1000;
         int yeer = 0;
         while ( yeer < 10) {
             y = y +totalOneYeer;
             yeer = yeer + 1;
            System.out.println("Год " + yeer + " численность населения составляет " + y);
        }
        System.out.println("Задача 4-5");
        int investment = 15_000;
        int totalOne = investment * 7 / 100 ;
        int q = 1;
        for  (; investment < 12_000_000; q++) {
            investment = investment + totalOne;
            if (q % 6 == 0){
                System.out.println("Месяц " + q + " сумма накоплений равна " + investment + " рублей");
            }
        }
        System.out.println("Задача 6");
         int investmentTwo = 15_000;
         int totalTwo = investmentTwo * 7 / 100 ;
         int month = 9 * 12;
         int w = 1;
         for  (; w <= month; w++) {
            investmentTwo = investmentTwo + totalTwo;
            if (w % 6 == 0){
                System.out.println("Месяц " + w + " сумма накоплений равна " + investmentTwo + " рублей");
            }
        }
        System.out.println("Задача 7");
         int friday = 3;
         while (friday < 31) {
             friday = friday +7;
             System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");
         }
        System.out.println("Задача 8");
        int comet = 79;
        int yeerTwo = 0;
        while (yeerTwo < 3000) {
            yeerTwo = yeerTwo + comet;
            if (yeerTwo > 1824 && yeerTwo < 2124) {
                System.out.println(yeerTwo);
            }
        }


    }
}