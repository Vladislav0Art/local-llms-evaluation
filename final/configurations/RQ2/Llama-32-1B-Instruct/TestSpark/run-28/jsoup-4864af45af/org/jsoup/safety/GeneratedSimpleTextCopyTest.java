package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSimpleTextCopyTest {

    @Test
    public void simpleTextCopyTest() {
        Safelist safeList = new Safelist();
        safeList.addTags("test");
        safeList.removeTags("test");
        assertTrue(safeList.isSafeTag(""));
        assertFalse(safeList.isSafeAttribute("", ""));
    }

}