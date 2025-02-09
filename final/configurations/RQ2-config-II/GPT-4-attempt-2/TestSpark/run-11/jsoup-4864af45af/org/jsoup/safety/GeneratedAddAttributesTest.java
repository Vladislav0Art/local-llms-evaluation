package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Map;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        String[] attributes = {"style", "class"};
        safelist.addAttributes("p", attributes);
        Element element = new Element("p");
        element.attr("style", "bold");
        element.attr("class", "testClass");
        assertTrue(safelist.isSafeAttribute("p", element, new Attribute("style", "bold")));
        assertTrue(safelist.isSafeAttribute("p", element, new Attribute("class", "testClass")));
    }

}