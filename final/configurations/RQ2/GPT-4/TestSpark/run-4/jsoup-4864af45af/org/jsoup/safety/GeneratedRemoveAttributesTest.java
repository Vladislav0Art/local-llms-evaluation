package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    // Test None Safelist

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeAttributes("a", "href");
        Element el = new Element("a");
        el.attr("href", "http://example.com");
        assertFalse(safelist.isSafeAttribute("a", el, el.attributes().asList().get(0)));
    }

}