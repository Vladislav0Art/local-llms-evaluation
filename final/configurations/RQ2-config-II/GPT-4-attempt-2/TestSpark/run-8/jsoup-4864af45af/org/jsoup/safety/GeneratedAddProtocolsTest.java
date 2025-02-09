package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols("a", "href", "http");
        safelist.addTags("a");
        Element el = new Element("a");
        el.attr("href", "http://example.com");

        assertTrue(safelist.isSafeAttribute("a", el, el.attributes().asList().get(0)));
    }

}