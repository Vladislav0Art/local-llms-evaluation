package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.none();
        safelist.preserveRelativeLinks(true);
        Element testElement = new Element("a");
        testElement.attr("href", "/testPage");
        assertTrue(safelist.isSafeAttribute("a", testElement, new Attribute("href", "/testPage")));
    }

}