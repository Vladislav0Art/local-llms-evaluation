package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.addAttributes("p", "style");
        Attributes attributes = safelist.getEnforcedAttributes("p");
        assertTrue(attributes.hasKey("style"));
        safelist.removeAttributes("p", "style");
        attributes = safelist.getEnforcedAttributes("p");
        assertFalse(attributes.hasKey("style"));
    }

}