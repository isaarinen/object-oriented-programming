public class SafeListTest {
    public static void main(String[] args) {
        SafeList<String> safeList = new SafeList<>();

        Thread adder = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                safeList.add("Item " + i);
            }
        });

        Thread remover = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                safeList.remove(0);
            }
        });

        adder.start();
        remover.start();

        try {
            adder.join();
            remover.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final size: " + safeList.size());
    }
}
