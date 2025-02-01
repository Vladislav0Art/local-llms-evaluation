package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes("p", "style", "class");
        Element element = new Element("p");
        element.attr("style", "color:red");
        element.attr("class", "myClass");
        Attribute attribute = element.attributes().asList().get(0);
        assertTrue(safelist.isSafeAttribute("p", element, attribute));
    }

}