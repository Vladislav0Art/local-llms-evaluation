package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedRelaxed_NoAttributesTest {

    @Test
    public void relaxed_NoAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeAttribute("", null, null));
        assertFalse(safelist.isSafeAttribute("img", null, null));
    }

}