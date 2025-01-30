package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = Safelist.basic();
        Element element = new Element("a").attr("href", "http://example.com");
        Attribute attr = new Attribute("href", "http://example.com");
        boolean isSafe = safelist.isSafeAttribute("a", element, attr);
        assertTrue(isSafe);
    }

}