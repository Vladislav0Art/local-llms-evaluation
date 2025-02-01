package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = Safelist.relaxed();
        Element element = new Element("a");
        Attribute href = new Attribute("href", "http://example.com");
        Attribute style = new Attribute("style", "width:100px");

        assertTrue(safelist.isSafeAttribute("a", element, href));
        assertFalse(safelist.isSafeAttribute("a", element, style));
    }

}