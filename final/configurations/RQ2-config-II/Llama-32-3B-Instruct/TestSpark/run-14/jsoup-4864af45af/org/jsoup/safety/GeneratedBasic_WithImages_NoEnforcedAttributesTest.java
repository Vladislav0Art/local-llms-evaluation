package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedBasic_WithImages_NoEnforcedAttributesTest {

    @Test
    public void basic_WithImages_NoEnforcedAttributesTest() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("span"));
        assertTrue(safelist.isSafeTag("img"));
        assertEquals(0, safelist.getEnforcedAttributes("img").size());
    }

}