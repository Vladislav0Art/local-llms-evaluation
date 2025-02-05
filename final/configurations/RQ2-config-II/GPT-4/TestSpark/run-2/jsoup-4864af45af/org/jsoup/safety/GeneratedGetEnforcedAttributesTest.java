package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedGetEnforcedAttributesTest {

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("tag", "attribute", "value");
        Attributes attributes = safelist.getEnforcedAttributes("tag");
        Assert.assertEquals("value", attributes.get("attribute"));
    }

}