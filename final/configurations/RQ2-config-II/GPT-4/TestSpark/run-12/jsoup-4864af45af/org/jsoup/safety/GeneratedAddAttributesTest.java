package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("Tag1", "Attribute1", "Attribute2");
        Element element = new Element("Tag1");
        element.attributes().put("Attribute1", "value");
        Assert.assertTrue(safelist.isSafeAttribute("Tag1", element, new Attribute("Attribute1", "value")));
    }

}