package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBasicWithImagesCopyTest {

    @Test
    public void basicWithImagesCopyTest() {
        Safelist safeList = new Safelist();
        safeList.addTags("test");
        safeList.removeTags("test");
        assertEquals(safeList.basicWithImages(), safeList);
    }

}