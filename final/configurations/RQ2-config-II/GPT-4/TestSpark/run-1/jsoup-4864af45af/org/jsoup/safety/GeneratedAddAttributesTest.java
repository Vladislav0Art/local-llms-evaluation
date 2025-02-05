package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist().addTags("tag").addAttributes("tag", "attr1", "attr2");
        Element element = new Element("tag");
        element.attr("attr1", "val1");
        element.attr("attr2", "val2");
        Attribute attr1 = element.attributes().asList().get(0);
        Attribute attr2 = element.attributes().asList().get(1);
        assertTrue(safelist.isSafeAttribute("tag", element, attr1));
        assertTrue(safelist.isSafeAttribute("tag", element, attr2));
    }

}