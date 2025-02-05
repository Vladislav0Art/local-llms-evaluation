package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.junit.Assert;

import java.util.Set;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("tag1", "attr1", "value1");
        Attributes attrs = safelist.getEnforcedAttributes("tag1");
        Assert.assertTrue(attrs.hasKey("attr1"));
        Assert.assertEquals("value1", attrs.get("attr1"));
    }

}