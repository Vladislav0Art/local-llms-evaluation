package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNoneCopyTest {

    @Test
    public void noneCopyTest() {
        Safelist safeList = new Safelist();
        safeList.copy(safeList);
        assertTrue(safeList.equals(safeList));
    }

}