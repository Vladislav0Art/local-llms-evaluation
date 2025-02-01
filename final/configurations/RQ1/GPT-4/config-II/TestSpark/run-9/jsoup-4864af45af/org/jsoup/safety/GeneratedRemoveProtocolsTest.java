package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols("a", "href", "http", "https");
        safelist.removeProtocols("a", "href", "http");
        Attribute attr = new Attribute("href", "https://google.com");
        assertTrue(safelist.isSafeAttribute("a", new Element("a"), attr));
        attr = new Attribute("href", "http://google.com");
        assertFalse(safelist.isSafeAttribute("a", new Element("a"), attr));
    }

}