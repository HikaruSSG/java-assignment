public class Loop {
    public void forLoopExample() {
        System.out.println("For Loop Example:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }

    public void whileLoopExample() {
        System.out.println("While Loop Example:");
        int i = 0;
        while (i < 5) {
            System.out.println("Iteration: " + i);
            i++;
        }
    }

    public void doWhileLoopExample() {
        System.out.println("Do-While Loop Example:");
        int i = 0;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i < 5);
    }
}
