package org.jsoup.safety;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.none().addProtocols("a", "href", "ftp");
        Element el = new Element("a");
        el.attr("href", "ftp://ftp.google.com");
        Attribute attr = el.attributes().get(0);
        assertTrue(safelist.isSafeAttribute("a", el, attr));
    }

}