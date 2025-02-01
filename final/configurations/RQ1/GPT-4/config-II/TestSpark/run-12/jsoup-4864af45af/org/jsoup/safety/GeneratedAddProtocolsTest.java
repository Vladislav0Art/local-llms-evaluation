package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.relaxed();
        Element element = new Element("a");
        element.attr("href", "ftp://example.com");
        Attribute attribute = element.attributes().asList().get(0);
        assertFalse(safelist.isSafeAttribute("a", element, attribute));
        safelist.addProtocols("a", "href", "ftp");
        assertTrue(safelist.isSafeAttribute("a", element, attribute));
    }

}