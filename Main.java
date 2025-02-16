public class Main {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        arithmetic.add(10, 5);
        arithmetic.subtract(10, 5);
        arithmetic.multiply(10, 5);
        arithmetic.divide(10, 5);
        
        Loop loop = new Loop();
        loop.forLoopExample();
        loop.whileLoopExample();
        loop.doWhileLoopExample();
        
        // Call the VariableExamples
        VariableExamples.main(args);
        Conditional.checkNumber(5);
        SwitchExample switchExample = new SwitchExample();
        switchExample.main(args);
    }
}
