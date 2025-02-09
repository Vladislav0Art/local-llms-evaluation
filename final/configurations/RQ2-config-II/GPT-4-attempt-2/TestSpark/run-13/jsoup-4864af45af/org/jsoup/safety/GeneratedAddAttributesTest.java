package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();

        safelist.addAttributes("a", "href");

        Element element = new Element("a");
        Attribute attr = new Attribute("href", "http://example.com");

        assertTrue(safelist.isSafeAttribute("a", element, attr));
    }

}