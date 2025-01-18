package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1");
        safelist.addEnforcedAttribute("tag1", "attr1", "value1");

        Assert.assertTrue(safelist.getEnforcedAttributes("tag1").hasKey("attr1"));
        Assert.assertEquals("value1", safelist.getEnforcedAttributes("tag1").get("attr1"));
    }

}