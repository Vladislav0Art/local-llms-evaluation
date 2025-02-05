package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("tag", "safeAttribute");
        Element element = new Element("tag");
        Attribute attribute = new Attribute("safeAttribute", "value");
        Assert.assertTrue(safelist.isSafeAttribute("tag", element, attribute));
        attribute = new Attribute("unsafeAttribute", "value");
        Assert.assertFalse(safelist.isSafeAttribute("tag", element, attribute));
    }

}