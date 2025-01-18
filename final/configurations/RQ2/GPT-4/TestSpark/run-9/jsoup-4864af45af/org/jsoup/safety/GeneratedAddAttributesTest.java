package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("tag1", "attr1", "attr2");
        Element element = new Element("tag1");
        element.attr("attr1", "value1");
        element.attr("attr2", "value2");
        assertTrue(safelist.isSafeAttribute("tag1", element, new Attribute("attr1", "value1")));
        assertTrue(safelist.isSafeAttribute("tag1", element, new Attribute("attr2", "value2")));
    }

}