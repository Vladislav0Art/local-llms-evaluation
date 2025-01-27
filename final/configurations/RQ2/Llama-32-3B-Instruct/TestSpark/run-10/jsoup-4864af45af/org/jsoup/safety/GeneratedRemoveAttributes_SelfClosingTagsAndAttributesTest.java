package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedRemoveAttributes_SelfClosingTagsAndAttributesTest {

    @Test
    public void removeAttributes_SelfClosingTagsAndAttributesTest() {
        Safelist safelist = Safelist.removeAttributes("script", "href");
        assertTrue(safelist.isSafeAttribute("script", null, "type"));
        assertFalse(safelist.isSafeAttribute("script", null, "href"));
    }

}