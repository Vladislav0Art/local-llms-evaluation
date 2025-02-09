package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Map;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        String[] protocols = {"http", "https"};
        safelist.addProtocols("a", "href", protocols);
        Element element = new Element("a");
        element.attr("href", "https://test.com");
        assertTrue(safelist.isSafeAttribute("a", element, new Attribute("href", "https://test.com")));
        element.attr("href", "http://test.com");
        assertTrue(safelist.isSafeAttribute("a", element, new Attribute("href", "http://test.com")));
    }

}