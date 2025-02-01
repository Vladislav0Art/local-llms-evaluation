package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.none();
        Element element = new Element("a");
        Attribute attribute = new Attribute("href", "ftp://url.com");
        safelist.addProtocols("a", "href", "ftp");

        assertTrue(safelist.isSafeAttribute("a", element, attribute));
    }

}