package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.none();
        safelist.preserveRelativeLinks(true);

        Element element = new Element("a");
        Attribute attribute1 = new Attribute("href", "/relative/url");
        Attribute attribute2 = new Attribute("href", "http://url.com");

        assertTrue(safelist.isSafeAttribute("a", element, attribute1));
        assertTrue(safelist.isSafeAttribute("a", element, attribute2));
    }

}