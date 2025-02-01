package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "http");
        Element el = new Element("a");
        el.attr("href", "http://example.com");
        Attribute attr = el.attributes().asList().get(0);
        assertTrue(safelist.isSafeAttribute("a", el, attr));
    }

}