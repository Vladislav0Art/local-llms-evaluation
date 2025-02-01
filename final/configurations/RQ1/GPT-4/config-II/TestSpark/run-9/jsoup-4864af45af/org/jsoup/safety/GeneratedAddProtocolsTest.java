package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols("a", "href", "http", "https");
        Attribute attr = new Attribute("href", "https://google.com");
        assertTrue(safelist.isSafeAttribute("a", new Element("a"), attr));
        attr = new Attribute("href", "ftp://google.com");
        assertFalse(safelist.isSafeAttribute("a", new Element("a"), attr));
    }

}