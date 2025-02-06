package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSimpleText_SafeTagsTest {

    @Test
    public void simpleText_SafeTagsTest() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("span"));
        assertFalse(safelist.isSafeTag("img"));
    }

}