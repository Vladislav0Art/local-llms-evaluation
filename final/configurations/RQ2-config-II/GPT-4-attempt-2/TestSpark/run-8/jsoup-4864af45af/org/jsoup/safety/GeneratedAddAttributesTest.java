package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("tag").addAttributes("tag", "attribute");
        Attribute attribute = new Attribute("attribute", "value");
        Element el = new Element("tag");
        el.attr("attribute", "value");

        assertTrue(safelist.isSafeAttribute("tag", el, attribute));
    }

}