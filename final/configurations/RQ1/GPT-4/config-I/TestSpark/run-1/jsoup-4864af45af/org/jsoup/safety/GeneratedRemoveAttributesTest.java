package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeAttributes("a", "href", "title");

        Element el = new Element("a");
        el.attr("href", "http://test.com");
        el.attr("title", "Test Link");

        assertFalse(safelist.isSafeAttribute("a", el, el.attributes().asList().get(0)));
        assertFalse(safelist.isSafeAttribute("a", el, el.attributes().asList().get(1)));
    }

}