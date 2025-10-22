public class Main {
    public static void main(String[] args) {
        SimpleAccount simple = new SimpleAccount(1000);
        CreditAccount credit = new CreditAccount(0, 5000);

        System.out.println("обычный счет: " + simple.getBalance());
        System.out.println("кредитный счет: " + credit.getBalance());

        // Тестирование операций
        simple.booleanPay(500);
        credit.booleanPay(1000);

        System.out.println("после покупок:");
        System.out.println("обычный счет: " + simple.getBalance());
        System.out.println("кредитный счет: " + credit.getBalance());

       // Тестирование перевода
        simple.transfer(credit, 200);

        System.out.println("после перевода средств:");
        System.out.println("обычный счет: " + simple.getBalance());
        System.out.println("кредитный счет: " + credit.getBalance());

        // Тестирование логгеров
        Logger simpleLogger = new SimpleLogger();
        Logger smartLogger = new SmartLogger();

        simpleLogger.log("простое сообщение");
        smartLogger.log("умное сообщение");
        smartLogger.log("error");
        smartLogger.log("ERrOR");
        simpleLogger.log("=)");
        smartLogger.log("далее");
    }
}