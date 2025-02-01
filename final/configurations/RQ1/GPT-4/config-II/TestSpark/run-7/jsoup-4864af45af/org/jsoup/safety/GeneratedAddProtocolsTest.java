package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("a");
        safelist.addAttributes("a", "href");
        safelist.addProtocols("a", "href", "http");
        Element element = new Element("a");
        Attribute href = new Attribute("href", "http://example.com");
        assertTrue(safelist.isSafeAttribute("a", element, href));
    }

}