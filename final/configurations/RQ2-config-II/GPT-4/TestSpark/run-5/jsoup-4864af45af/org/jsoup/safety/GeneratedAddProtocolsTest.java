package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "http");
        Element testElement = new Element("a");
        testElement.attr("href", "http://example.com");
        assertTrue(safelist.isSafeAttribute("a", testElement, new Attribute("href", "http://example.com")));
    }

}