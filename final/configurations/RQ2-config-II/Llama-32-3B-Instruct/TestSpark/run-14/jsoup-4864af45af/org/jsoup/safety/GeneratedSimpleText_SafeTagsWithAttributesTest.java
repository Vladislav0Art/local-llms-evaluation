package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSimpleText_SafeTagsWithAttributesTest {

    @Test
    public void simpleText_SafeTagsWithAttributesTest() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("span"));
        assertFalse(safelist.isSafeTag("img"));
        assertEquals(0, safelist.getEnforcedAttributes("img").size());
    }

}