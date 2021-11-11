package Lesson14;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {
        WorkWithMassive workWithMassive=new WorkWithMassive();
        int[] preMassive = {1, 5, 3, 7, 4, 5, 6, 7, 5};
        System.out.println(Arrays.toString(workWithMassive.doRevertMassive(preMassive)));
        System.out.println(workWithMassive.checkArrayFor1And4(preMassive));
    }

}
