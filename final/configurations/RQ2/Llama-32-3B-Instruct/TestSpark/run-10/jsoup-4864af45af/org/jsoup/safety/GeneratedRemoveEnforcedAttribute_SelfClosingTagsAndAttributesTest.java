package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedRemoveEnforcedAttribute_SelfClosingTagsAndAttributesTest {

    @Test
    public void removeEnforcedAttribute_SelfClosingTagsAndAttributesTest() {
        Safelist safelist = Safelist.removeEnforcedAttribute("script", "type");
        assertTrue(safelist.isSafeAttribute("script", null, "type"));
        assertFalse(safelist.isSafeAttribute("script", null, "href"));
    }

}