package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "http://example.com")));
        assertFalse(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "ftp://example.com")));
        safelist.addProtocols("a", "href", "ftp");
        assertTrue(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "ftp://example.com")));
    }

}