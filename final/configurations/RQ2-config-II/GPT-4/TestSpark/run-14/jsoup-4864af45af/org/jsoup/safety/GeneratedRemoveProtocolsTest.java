package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeProtocols("a", "href", "http");
        Element element = new Element("a");
        element.attr("href", "http://example.com");
        for (Attribute attribute : element.attributes()) {
            assertFalse(safelist.isSafeAttribute("a", element, attribute));
        }
    }

}