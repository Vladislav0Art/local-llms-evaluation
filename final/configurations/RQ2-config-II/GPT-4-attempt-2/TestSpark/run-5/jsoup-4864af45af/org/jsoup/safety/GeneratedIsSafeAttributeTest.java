package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = new Safelist();
        Element element = new Element("tag");
        Attribute attribute = new Attribute("attribute", "value");
        boolean result = safelist.isSafeAttribute("tag", element, attribute);
        Assert.assertFalse(result);
        safelist.addAttributes("tag", "attribute");
        result = safelist.isSafeAttribute("tag", element, attribute);
        Assert.assertTrue(result);
    }

}