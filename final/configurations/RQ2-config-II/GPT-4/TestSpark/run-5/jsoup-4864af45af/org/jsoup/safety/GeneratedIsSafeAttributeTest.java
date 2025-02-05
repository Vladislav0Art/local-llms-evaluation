package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = Safelist.simpleText();
        Element testElement = new Element("body");
        assertTrue(safelist.isSafeAttribute("body", testElement, new Attribute("class", "testClass")));
        assertFalse(safelist.isSafeAttribute("body", testElement, new Attribute("onclick", "alert('test')")));
    }

}