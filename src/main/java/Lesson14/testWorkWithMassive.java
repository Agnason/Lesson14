package Lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class testWorkWithMassive {
    private WorkWithMassive workWithMassive;
    @BeforeEach
    public void init() {
        workWithMassive = new WorkWithMassive();
    }
    @Test
    public void testDoRevertMassive1() {
        Assertions.assertArrayEquals(new int[]{5, 6, 7, 8}, workWithMassive.doRevertMassive(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }
    @Test
    public void testDoRevertMassive2() {
        Assertions.assertArrayEquals(new int[]{ 8}, workWithMassive.doRevertMassive(new int[]{2, 2, 4, 4, 5, 6, 4, 8}));
    }
    @Test
    public void testDoRevertMassive3() {
        Assertions.assertArrayEquals(new int[]{ }, workWithMassive.doRevertMassive(new int[]{2, 2, 4, 4, 5, 6, 4, 4}));
    }
    @Test
    public void testThrowDoRevertMassive () {
        Assertions.assertThrows(RuntimeException.class, () ->{
            workWithMassive.doRevertMassive(new int [] {1,2,3,5});
        });
    }
   @Test
    public void testCheckArrayFor1And4True () {
        Assertions.assertTrue(workWithMassive.checkArrayFor1And4(new int[]{1,2,3,4}));
   }
    @Test
    public void testCheckArrayFor1And4False () {
        Assertions.assertFalse(workWithMassive.checkArrayFor1And4(new int[]{0,2,3,4}));
    }
@CsvSource({"{0,2,3,4}"})
@ParameterizedTest
    public void testCheckArrayFor1And4False2 (int [] massive) {
        Assertions.assertFalse(workWithMassive.checkArrayFor1And4(massive));
    }
}
