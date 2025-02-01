package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p", "a");
        safelist.addAttributes("a", "href");
        Attribute href = new Attribute("href", "https://google.com");
        Attribute style = new Attribute("style", "color:red");
        Element element = new Element("a").attr("href", "https://google.com");
        assertTrue(safelist.isSafeAttribute("a", element, href));
        assertFalse(safelist.isSafeAttribute("p", element, style));
    }

}