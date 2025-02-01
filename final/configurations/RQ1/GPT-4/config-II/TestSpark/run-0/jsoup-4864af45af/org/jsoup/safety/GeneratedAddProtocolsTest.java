package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("a");
        safelist.addProtocols("a", "href", "http", "https");
        Element element = new Element("a");
        element.attr("href", "http://www.google.com");
        Attribute attribute = element.attributes().asList().get(0);
        assertTrue(safelist.isSafeAttribute("a", element, attribute));
        element.attr("href", "ftp://www.google.com");
        attribute = element.attributes().asList().get(0);
        assertFalse(safelist.isSafeAttribute("a", element, attribute));
    }

}