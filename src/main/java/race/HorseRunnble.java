package race;

public class HorseRunnble implements Runnable{
    String name = "horse3";
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(name + " " + i);
        }
    }
}
