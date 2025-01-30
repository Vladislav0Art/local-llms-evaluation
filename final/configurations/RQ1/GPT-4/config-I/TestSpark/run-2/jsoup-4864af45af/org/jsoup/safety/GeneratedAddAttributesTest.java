package org.jsoup.safety;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("a");
        safelist.addAttributes("a", "href");
        Element element = new Element("a");
        Attribute attribute = new Attribute("href", "http://example.com");
        element.attributes().put(attribute);
        assertTrue(safelist.isSafeAttribute("a", element, attribute));
    }

}