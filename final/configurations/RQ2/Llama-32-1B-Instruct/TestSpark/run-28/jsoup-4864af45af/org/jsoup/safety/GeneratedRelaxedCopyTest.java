package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRelaxedCopyTest {

    @Test
    public void relaxedCopyTest() {
        Safelist safeList = new Safelist();
        safeList.addTags("test");
        safeList.removeTags("test");
        assertTrue(safeList.isSafeTag(""));
        assertFalse(safeList.isSafeAttribute("", ""));
    }

}