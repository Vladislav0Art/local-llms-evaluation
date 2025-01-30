package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeAttributes("a", "href");
        Element element = new Element("a");
        element.attr("href", "http://test.com");
        Attributes attrs = element.attributes();
        assertFalse(safelist.isSafeAttribute("a", element, attrs.iterator().next()));
    }

}