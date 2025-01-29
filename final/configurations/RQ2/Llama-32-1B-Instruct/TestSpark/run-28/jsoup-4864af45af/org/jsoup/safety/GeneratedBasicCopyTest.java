package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBasicCopyTest {

    @Test
    public void basicCopyTest() {
        Safelist safeList = new Safelist();
        safeList.addTags("test");
        safeList.removeTags("test");
        assertEquals(safeList.basic(), safeList);
    }

}