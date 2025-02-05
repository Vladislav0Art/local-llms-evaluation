package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols("a", "href", "http");
        Element element = new Element("a");
        element.attr("href", "http://example.com");
        for (Attribute attribute : element.attributes()) {
            assertTrue(safelist.isSafeAttribute("a", element, attribute));
        }
    }

}