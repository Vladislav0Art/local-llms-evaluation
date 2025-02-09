package org.jsoup.safety;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none().addTags("div").addAttributes("div", "attr");
        Element el = new Element("div");
        el.attr("attr", "value");
        Attribute attr = el.attributes().get(0);
        assertTrue(safelist.isSafeAttribute("div", el, attr));
    }

}