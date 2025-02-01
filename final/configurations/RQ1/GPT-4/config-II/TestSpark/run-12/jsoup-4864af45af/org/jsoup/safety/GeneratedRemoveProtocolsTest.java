package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.relaxed();
        Element element = new Element("a");
        element.attr("href", "http://example.com");
        Attribute attribute = element.attributes().asList().get(0);
        assertTrue(safelist.isSafeAttribute("a", element, attribute));
        safelist.removeProtocols("a", "href", "http");
        assertFalse(safelist.isSafeAttribute("a", element, attribute));
    }

}