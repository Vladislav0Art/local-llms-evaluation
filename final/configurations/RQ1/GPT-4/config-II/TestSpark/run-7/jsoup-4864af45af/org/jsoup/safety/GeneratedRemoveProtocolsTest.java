package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.basic();
        Element element = new Element("a");
        Attribute href = new Attribute("href", "http://example.com");
        assertTrue(safelist.isSafeAttribute("a", element, href));
        safelist.removeProtocols("a", "href", "http");
        assertFalse(safelist.isSafeAttribute("a", element, href));
    }

}