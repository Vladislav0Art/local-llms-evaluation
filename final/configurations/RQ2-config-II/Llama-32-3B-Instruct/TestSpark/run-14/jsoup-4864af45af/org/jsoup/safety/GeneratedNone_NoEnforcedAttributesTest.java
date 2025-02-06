package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNone_NoEnforcedAttributesTest {

    @Test
    public void none_NoEnforcedAttributesTest() {
        Safelist safelist = Safelist.none();
        assertEquals(0, safelist.getEnforcedAttributes("img").size());
        assertTrue(safelist.isSafeAttribute("", null, null));
    }

}