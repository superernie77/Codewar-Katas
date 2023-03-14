package kataskatas;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

import katas.ProductArray;

public class ProductArrayTest
{
    @Test
    public void Test_Small_Array_Size()
    {
        assertArrayEquals(new long[]{20,12}, ProductArray.productArray(new int[]{12,20}));
        assertArrayEquals(new long[]{10,2,5}, ProductArray.productArray(new int[]{1,5,2}));
        assertArrayEquals(new long[]{216,24,162,324}, ProductArray.productArray(new int[]{3,27,4,2}));
    }
    @Test
    public void Test_Larger_Array_Size()
    {
        assertArrayEquals(new long[]{900,1170,2340,5850,1300}, ProductArray.productArray(new int[]{13,10,5,2,9}));
        assertArrayEquals(new long[]{2040,1920,8160,10880,6528,16320}, ProductArray.productArray(new int[]{16,17,4,3,5,2}));
    }
    @Test
    public void Test_Very_Large_Products()
    {
        assertArrayEquals(new long[]{670442572800L,609493248000L,558702144000L,515725056000L,478887552000L,
                                     446961715200L,419026608000L,394377984000L,372468096000L,352864512000L,
                                     335221286400L},
        		ProductArray.productArray(new int[]{10,11,12,13,14,15,16,17,18,19,20}));
    }
}