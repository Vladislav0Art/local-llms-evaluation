package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("a");
        safelist.addAttributes("a", "href");
        safelist.addProtocols("a", "href", "https");
        Attribute href = new Attribute("href", "https://google.com");
        Attribute hrefUnsafe = new Attribute("href", "http://google.com");
        Element element = new Element("a").attr("href", "https://google.com");
        assertTrue(safelist.isSafeAttribute("a", element, href));
        assertFalse(safelist.isSafeAttribute("a", element, hrefUnsafe));
    }

}