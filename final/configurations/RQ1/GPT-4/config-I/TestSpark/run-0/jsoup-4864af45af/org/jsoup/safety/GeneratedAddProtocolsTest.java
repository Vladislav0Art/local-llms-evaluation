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
        assertFalse(safelist.isSafeTag("a"));
        safelist.addTags("a");
        assertTrue(safelist.isSafeTag("a"));
        Element a = new Element("a");
        a.attr("href", "http://example.com");
        assertFalse(safelist.isSafeAttribute("a", a, a.attributes().asList().get(0)));
        safelist.addAttributes("a", "href");
        assertTrue(safelist.isSafeAttribute("a", a, a.attributes().asList().get(0)));
        Element aJs = new Element("a");
        aJs.attr("href", "javascript:alert(1)");
        assertFalse(safelist.isSafeAttribute("a", aJs, aJs.attributes().asList().get(0)));
        safelist.addProtocols("a", "href", "javascript");
        assertTrue(safelist.isSafeAttribute("a", aJs, aJs.attributes().asList().get(0)));
    }

}