package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedRemoveProtocols_SelfClosingTagsAndAttributesTest {

    @Test
    public void removeProtocols_SelfClosingTagsAndAttributesTest() {
        Safelist safelist = Safelist.removeProtocols("script", "type", "https://example.com");
        assertTrue(safelist.isSafeAttribute("script", null, "type"));
        assertFalse(safelist.isSafeAttribute("script", null, "href"));
    }

}