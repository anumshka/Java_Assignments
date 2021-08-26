public class AccountOverdrawDemo implements Runnable {

    private Account account = new Account();

    public static void main(String[] args) {

        AccountOverdrawDemo job = new AccountOverdrawDemo();
        //Making a job
        Thread first = new Thread(job);
        Thread second = new Thread(job);

        //Making two threads and giving each of them the same job
        first.setName("Rachel");
        second.setName("Ross");

        //Starting the threads
        first.start();
        second.start();
    }

    @Override
    public void run() {
        //The while loop runs 5 times
        //Each iteration makes a withdrawl of 200
        int times = 5;
        while (times > 0) {
            makeWihdrawal(200);
            //Checks the balance and indicates Overdrawn!! if overdrawn
            if (account.getBalance() < 0) {
                System.out.println("Overdrawn!!");
            }
            times--;
        }
    }

        private  void makeWihdrawal(int amount) {
        System.out.println("Current Balance: " + account.getBalance());
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw the money");
            System.out.println(Thread.currentThread().getName() + " is going to sleep");

            //Thread sleeps here for 5000 milliseconds
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Thread resumes
            System.out.println(Thread.currentThread().getName() + " woke up");

            //Amount gets withdrawn
            account.withdraw(amount);

            //The withdrawl action gets completed here
            System.out.println(Thread.currentThread().getName() + " completes the withdrawl");
        }
//        if the person does not have that much money
        else {
            System.out.println("Sorry " + Thread.currentThread().getName() + ",You do not have that much money");
        }
    }


}
