package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes("tag1", "attr1", "attr2");
        Element element = new Element("tag1");
        element.attr("attr1", "");
        element.attr("attr2", "");
        for (Attribute attribute : element.attributes()) {
            assertTrue(safelist.isSafeAttribute("tag1", element, attribute));
        }
    }

}