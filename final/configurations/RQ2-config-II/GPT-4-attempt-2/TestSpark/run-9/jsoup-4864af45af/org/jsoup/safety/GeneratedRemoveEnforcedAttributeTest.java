package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeEnforcedAttribute("a", "href");
        Attributes attributes = safelist.getEnforcedAttributes("a");
        assertFalse(attributes.hasKey("href"));
    }

}