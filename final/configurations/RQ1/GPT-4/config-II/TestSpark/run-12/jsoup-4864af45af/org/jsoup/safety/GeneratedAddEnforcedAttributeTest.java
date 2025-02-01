package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.addEnforcedAttribute("p", "style", "color:red");
        Element element = new Element("p");
        element.attr("style", "color:red");
        Attribute attribute = element.attributes().asList().get(0);
        assertTrue(safelist.isSafeAttribute("p", element, attribute));
    }

}