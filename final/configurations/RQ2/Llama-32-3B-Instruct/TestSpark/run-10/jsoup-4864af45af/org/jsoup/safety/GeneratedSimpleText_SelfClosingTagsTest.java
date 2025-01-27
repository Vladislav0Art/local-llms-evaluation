package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedSimpleText_SelfClosingTagsTest {

    @Test
    public void simpleText_SelfClosingTagsTest() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("/body"));
        assertTrue(safelist.isSafeTag("/p"));
        assertFalse(safelist.isSafeTag("<body>"));
        assertFalse(safelist.isSafeTag("</body>"));
    }

}