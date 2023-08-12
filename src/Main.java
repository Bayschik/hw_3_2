public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(15000);
        try {
            while(true){
                bankAccount.withDraw(6000);
                System.out.println("Снято 6000 сом. Остаток: " + bankAccount.getAmount());
            }
        }catch (LimitException e){
            System.out.println("Исключение: " + e.getMessage());
            System.out.println("Снято только: " + e.getRemainingAmount());
        }
    }
}



