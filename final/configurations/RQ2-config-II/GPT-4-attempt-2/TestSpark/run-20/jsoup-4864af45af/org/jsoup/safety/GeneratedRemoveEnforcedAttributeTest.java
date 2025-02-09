package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeEnforcedAttribute("a", "rel");

        assertTrue(safelist.getEnforcedAttributes("a").isEmpty());
    }

}