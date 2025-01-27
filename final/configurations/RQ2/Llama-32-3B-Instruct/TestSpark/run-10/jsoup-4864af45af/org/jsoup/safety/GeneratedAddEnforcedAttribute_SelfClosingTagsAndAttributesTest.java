package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedAddEnforcedAttribute_SelfClosingTagsAndAttributesTest {

    @Test
    public void addEnforcedAttribute_SelfClosingTagsAndAttributesTest() {
        Safelist safelist = Safelist.addEnforcedAttribute("img", "src", "https://example.com");
        assertTrue(safelist.isSafeAttribute("img", null, "src"));
        assertFalse(safelist.isSafeAttribute("img", null, "href"));
    }

}