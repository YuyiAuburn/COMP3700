import org.junit.*;
import org.junit.Assert;


public class FinderTest {
    @Test
    public void test_findMax_1(){
        Finder finder = new Finder();
        int[] invalidArray = new int[]{};
        Integer expectedResult = null;
        Integer actualResult = finder.findMax(invalidArray);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void test_findMax_2(){
        Finder finder = new Finder();
        int[] invalidArray = null;
        Integer expectedResult = null;
        Integer actualResult = finder.findMax(invalidArray);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void test_findMax_3(){
        Finder finder = new Finder();
        int[] validArray = new int[]{-9, 3, 5, 0, 99};
        Integer expectedResult = 99;
        Integer actualResult = finder.findMax(validArray);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void test_findMin_1(){
        Finder finder = new Finder();
        int[] invalidArray = new int[]{};
        Integer expectedResult = null;
        Integer actualResult = finder.findMin(invalidArray);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void test_findMin_2(){
        Finder finder = new Finder();
        int[] invalidArray = null;
        Integer expectedResult = null;
        Integer actualResult = finder.findMin(invalidArray);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void test_findMin_3(){
        Finder finder = new Finder();
        int[] validArray = new int[]{-9, 3, 5, 0, 99};
        Integer expectedResult = -9;
        Integer actualResult = finder.findMin(validArray);
        Assert.assertEquals(expectedResult, actualResult);
    }
}

