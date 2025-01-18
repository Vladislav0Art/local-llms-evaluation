package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("tag1", "attr1", "http", "https");
        Element element = new Element("tag1");
        element.attr("attr1", "http://example.com");
        assertTrue(safelist.isSafeAttribute("tag1", element, new Attribute("attr1", "http://example.com")));
        element.attr("attr1", "https://example.com");
        assertTrue(safelist.isSafeAttribute("tag1", element, new Attribute("attr1", "https://example.com")));
    }

}