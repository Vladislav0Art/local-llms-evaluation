package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = Safelist.basic();
        Element element = new Element("a");
        Attribute attribute = new Attribute("href", "http://url.com");

        assertTrue(safelist.isSafeAttribute("a", element, attribute));
    }

}