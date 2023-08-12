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
//        BankAccount account=new BankAccount();
//        account.deposit(15000);
//        while (true){
//            try {
//                account.withDraw(6000);
//            } catch (LimitException e) {
//                try {
//                    account.withDraw((int) e.getRemainingAmount());
//                } catch (LimitException ex) {
//                    System.out.println(ex.getMessage());
//                }
//            }
//            System.out.println(account.getAmount());
//            if(account.getAmount()==0) {
//                break;
//            }
//        }
    }
}



//    BankAccount bankAccount = new BankAccount();
//        bankAccount.deposit(15000);
//
//                try {
//                while(true){
//                bankAccount.withDraw(6000);
//                System.out.println("Снято 6000 сом. Остаток: " + bankAccount.getAmount());
//                }
//                }catch (LimitException e){
//                System.out.println("Исключение: " + e.getMessage());
//                System.out.println("Снято только: " + e.getRemainingAmount());
//                }