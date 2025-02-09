package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        Attribute attribute = new Attribute("attribute", "value");
        Element el = new Element("tag");
        el.attr("attribute", "value");

        assertTrue(safelist.isSafeAttribute("tag", el, attribute));
        safelist.removeAttributes("tag", "attribute");
        assertFalse(safelist.isSafeAttribute("tag", el, attribute));
    }

}