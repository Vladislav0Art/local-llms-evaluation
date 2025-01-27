package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedRelaxed_SelfClosingTagsAndAttributesTest {

    @Test
    public void relaxed_SelfClosingTagsAndAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("/body"));
        assertTrue(safelist.isSafeAttribute("div", null, null));
        assertFalse(safelist.isSafeTag("<body>"));
        assertFalse(safelist.isSafeTag("</body>"));
    }

}