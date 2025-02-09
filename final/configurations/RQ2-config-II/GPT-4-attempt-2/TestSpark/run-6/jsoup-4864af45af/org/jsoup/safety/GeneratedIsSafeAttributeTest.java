package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = Safelist.relaxed();
        Element element = new Element("p");
        Attribute attribute = new Attribute("class", "value");
        assertTrue(safelist.isSafeAttribute("p", element, attribute));
    }

}