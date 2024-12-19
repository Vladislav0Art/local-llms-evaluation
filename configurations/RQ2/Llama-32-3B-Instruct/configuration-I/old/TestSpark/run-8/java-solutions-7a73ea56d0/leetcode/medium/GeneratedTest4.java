package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest4 {

    @Test
    public void test4() {
        String str = "hello";
        assertEquals("hello", str);
    }
}

class HelperClass {

    public static boolean arrayEquals(Object[] a, Object[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i a.length;
        ++i){
            if (!Objects.equals(a[i], b[i])) return false;
        }
        return true;
    }

    public static boolean objectArrayEquals(Object[][] a, Object[][] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i a.length;
        ++i){
            if (!Arrays.equals(a[i], b[i])) return false;
        }
        return true;
    }

    public static Object is(int x) {
        return x;
    }

}