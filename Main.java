import java.util.Random;

class RandomColorThread extends Thread { // Inherit dari kelas java.lang.Thread
    private final Random random = new Random();
    private final String processname;

    public RandomColorThread(String processname) { // Constructor
        this.processname = processname;
    }

    public void run() { // Runtime/Lifetime Thread
        for (int i=0; i<10; i++) {
            System.out.println("Proses: " + processname);
            int flag = random.nextInt(1000) + 1;
            
            if  (flag%3==0)          { System.out.println("merah"); }
            else if (flag%6==0)     { System.out.println("biru"); }
            else if (flag%5==0)     { System.out.println("hijau"); }
            else if (flag%10==0)    { System.out.println("kuning"); }
            else if (flag%7==0)     { System.out.println("jingga"); }
            else if (flag%14==0)    { System.out.println("ungu"); }
            else                    { System.out.println("putih"); }

            try { Thread.sleep(500); } // Delay untuk output
            catch (Exception e) { System.out.println("Exception is caught"); }
        }        
    }
}

public class Main {
    public static void main(String[] args) {
        Thread Process1 = new RandomColorThread("Proses 1"); // Membuat objek dari kelas Thread 
        Thread Process2 = new RandomColorThread("Proses 2"); // dengan nama proses merupakan parameter

        Process1.start();
        Process2.start();
    }
}