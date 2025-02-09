package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = Safelist.basic();

        Element element = new Element("a");
        Attribute attr = new Attribute("href", "http://example.com");

        assertTrue(safelist.isSafeAttribute("a", element, attr));
    }

}