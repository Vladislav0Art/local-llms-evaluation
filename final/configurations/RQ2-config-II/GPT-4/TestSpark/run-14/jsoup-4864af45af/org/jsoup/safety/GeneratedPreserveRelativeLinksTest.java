package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.none();
        safelist.preserveRelativeLinks(true);
        Element element = new Element("a");
        element.attr("href", "/");
        for (Attribute attribute : element.attributes()) {
            assertTrue(safelist.isSafeAttribute("a", element, attribute));
        }
    }

}