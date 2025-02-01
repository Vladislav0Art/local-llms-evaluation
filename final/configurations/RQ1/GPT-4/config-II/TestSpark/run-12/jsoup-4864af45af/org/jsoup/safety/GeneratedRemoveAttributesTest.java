package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        Element element = new Element("p");
        element.attr("style", "color:red");
        element.attr("class", "myClass");
        Attribute attribute = element.attributes().asList().get(0);
        assertTrue(safelist.isSafeAttribute("p", element, attribute));
        safelist.removeAttributes("p", "style", "class");
        assertFalse(safelist.isSafeAttribute("p", element, attribute));
    }

}