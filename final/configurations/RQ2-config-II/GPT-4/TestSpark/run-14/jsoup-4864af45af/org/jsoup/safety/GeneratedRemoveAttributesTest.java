package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeAttributes("a", "href");
        Element element = new Element("a");
        element.attr("href", "");
        for (Attribute attribute : element.attributes()) {
            assertFalse(safelist.isSafeAttribute("a", element, attribute));
        }
    }

}