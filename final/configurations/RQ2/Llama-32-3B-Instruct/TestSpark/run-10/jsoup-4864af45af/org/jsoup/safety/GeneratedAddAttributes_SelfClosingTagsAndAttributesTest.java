package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedAddAttributes_SelfClosingTagsAndAttributesTest {

    @Test
    public void addAttributes_SelfClosingTagsAndAttributesTest() {
        Safelist safelist = Safelist.addAttributes("img", "src");
        assertTrue(safelist.isSafeAttribute("img", null, "href"));
        assertTrue(safelist.isSafeAttribute("img", null, "src"));
        assertFalse(safelist.isSafeAttribute("img", null, "src"));
    }

}