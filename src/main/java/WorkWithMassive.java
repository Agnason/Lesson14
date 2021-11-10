import java.util.Arrays;


public class WorkWithMassive {


    public static void main(String[] args) {
        int[] preMassive = {1, 5, 3, 7, 4, 5, 6, 7, 5};
        System.out.println(Arrays.toString(doRevertMassive(preMassive)));
        System.out.println(checkArrayFor1And4(preMassive));

    }

    // Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив. Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
//Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
    // I способ
    /*public static int[] doRevertMassive1(int[] preMassive) throws RuntimeException {
        if (preMassive.length == 0) {
            throw new NullPointerException();
        }
        for (int element : preMassive) {
            if (element != 4) {
                throw new RuntimeException();
            }
        }
        int[] temp=preMassive;
        for (int i = 0; i < preMassive.length; i++) {
            if (preMassive[i] == 4) {
                temp = new int[preMassive.length - i - 1];
                for (int j = 0; j < preMassive.length - i - 1; j++) {
                    temp[j] = preMassive[i + j + 1];
                }
            }
        }
        return temp;
    }*/

    // II способ
    public static int[] doRevertMassive(int[] preMassive) throws RuntimeException {
        if (preMassive.length == 0) {
            throw new NullPointerException();
        }
        int lastIndexOf4 = -1;
        for (int i = 0; i < preMassive.length; i++) if (preMassive[i] == 4) lastIndexOf4 = i + 1;

        if (lastIndexOf4 == -1) throw new RuntimeException();
        else return Arrays.copyOfRange(preMassive, lastIndexOf4, preMassive.length);
    }
// Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы, то метод вернет false; Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//[ 1 1 1 4 4 1 4 4 ] -> true
//[ 1 1 1 1 1 1 ] -> false
//[ 4 4 4 4 ] -> false
//[ 1 4 4 1 1 4 3 ] -> false

    public static boolean checkArrayFor1And4(int[] arr) {
        int count1 = 0, count4 = 0;
        for (int element : arr) {
            if (element == 1) count1++;
            else if (element == 4) count4++;
        }
        return (count1 > 0 && count4 > 0);
    }


}

