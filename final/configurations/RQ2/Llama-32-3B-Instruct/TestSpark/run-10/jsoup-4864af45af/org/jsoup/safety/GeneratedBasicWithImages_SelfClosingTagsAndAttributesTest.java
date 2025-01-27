package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedBasicWithImages_SelfClosingTagsAndAttributesTest {

    @Test
    public void basicWithImages_SelfClosingTagsAndAttributesTest() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("/img"));
        assertTrue(safelist.isSafeAttribute("img", null, null));
        assertFalse(safelist.isSafeTag("<img>"));
        assertFalse(safelist.isSafeTag("</img>"));
    }

}