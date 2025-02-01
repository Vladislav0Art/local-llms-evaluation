package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href");
        Element el = new Element("a");
        el.attr("href", "http://example.com");
        Attribute attr = el.attributes().asList().get(0);
        assertTrue(safelist.isSafeAttribute("a", el, attr));
    }

}