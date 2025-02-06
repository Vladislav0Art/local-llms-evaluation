package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedBasic_NoAttributesTest {

    @Test
    public void basic_NoAttributesTest() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeAttribute("", null, null));
        assertFalse(safelist.isSafeAttribute("img", null, null));
    }

}