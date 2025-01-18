package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("tag1", "attr1", "http", "https");
        safelist.removeProtocols("tag1", "attr1", "http");
        Element element = new Element("tag1");
        element.attr("attr1", "http://example.com");
        assertFalse(safelist.isSafeAttribute("tag1", element, new Attribute("attr1", "http://example.com")));
        element.attr("attr1", "https://example.com");
        assertTrue(safelist.isSafeAttribute("tag1", element, new Attribute("attr1", "https://example.com")));
    }

}