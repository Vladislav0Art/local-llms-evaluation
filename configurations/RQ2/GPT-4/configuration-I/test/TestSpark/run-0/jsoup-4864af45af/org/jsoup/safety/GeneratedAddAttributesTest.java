package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    // Testing public static methods

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("tag1", "attr1", "attr2");
        Element element = new Element("tag1");
        element.attr("attr1", "");
        assertTrue(safelist.isSafeAttribute("tag1", element, new Attribute("attr1", "")));
    }

}