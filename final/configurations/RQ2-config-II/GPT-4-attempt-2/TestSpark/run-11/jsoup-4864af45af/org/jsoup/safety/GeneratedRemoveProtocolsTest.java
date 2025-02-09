package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Map;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        String[] protocols = {"http", "https"};
        safelist.addProtocols("a", "href", protocols);
        safelist.removeProtocols("a", "href", "https");
        Element element = new Element("a");
        element.attr("href", "https://test.com");
        assertFalse(safelist.isSafeAttribute("a", element, new Attribute("href", "https://test.com")));
        element.attr("href", "http://test.com");
        assertTrue(safelist.isSafeAttribute("a", element, new Attribute("href", "http://test.com")));
    }

}