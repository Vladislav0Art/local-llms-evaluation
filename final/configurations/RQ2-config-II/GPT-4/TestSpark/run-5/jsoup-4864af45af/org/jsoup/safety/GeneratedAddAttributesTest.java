package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes("body", "id", "class");
        Element testElement = new Element("body");
        testElement.attr("id", "testId");
        assertTrue(safelist.isSafeAttribute("body", testElement, new Attribute("id", "testId")));
    }

}