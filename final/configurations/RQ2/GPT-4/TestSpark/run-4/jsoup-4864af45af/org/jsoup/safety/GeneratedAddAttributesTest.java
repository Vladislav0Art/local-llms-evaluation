package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    // Test None Safelist

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes("a", "href");
        Element el = new Element("a");
        el.attr("href", "http://example.com");
        assertTrue(safelist.isSafeAttribute("a", el, el.attributes().asList().get(0)));
    }

}