package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("tag", "attr1", "attr2");
        Element element = new Element("tag");
        element.attr("attr1", "value1");
        Attribute attribute = element.attributes().iterator().next();
        assertTrue(safelist.isSafeAttribute("tag", element, attribute));
    }

}