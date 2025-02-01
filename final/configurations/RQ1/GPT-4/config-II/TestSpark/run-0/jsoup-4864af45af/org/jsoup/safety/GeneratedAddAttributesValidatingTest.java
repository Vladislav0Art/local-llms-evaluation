package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedAddAttributesValidatingTest {

    @Test
    public void addAttributesValidatingTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("a");
        safelist.addAttributes("a", "href");
        Element element = new Element("a");
        element.attr("href", "www.google.com");
        Attribute attribute = element.attributes().asList().get(0);
        assertTrue(safelist.isSafeAttribute("a", element, attribute));
        attribute = new Attribute("class", "link");
        assertFalse(safelist.isSafeAttribute("a", element, attribute));
    }

}