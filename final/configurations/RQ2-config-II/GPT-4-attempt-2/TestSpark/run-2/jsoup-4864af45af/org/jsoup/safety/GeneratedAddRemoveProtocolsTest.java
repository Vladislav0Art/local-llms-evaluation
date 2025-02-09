package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddRemoveProtocolsTest {

    @Test
    public void addRemoveProtocolsTest() {
        Safelist safelist = new Safelist().addTags("a").addAttributes("a", "href");
        assertTrue(safelist.isSafeAttribute("a", new Element("a").attr("href", "http://google.com"), new Attribute("href", "http://google.com")));

        safelist.addProtocols("a", "href", "ftp");
        assertTrue(safelist.isSafeAttribute("a", new Element("a").attr("href", "ftp://google.com"), new Attribute("href", "ftp://google.com")));

        safelist.removeProtocols("a", "href", "http");
        assertFalse(safelist.isSafeAttribute("a", new Element("a").attr("href", "http://google.com"), new Attribute("href", "http://google.com")));
    }

}