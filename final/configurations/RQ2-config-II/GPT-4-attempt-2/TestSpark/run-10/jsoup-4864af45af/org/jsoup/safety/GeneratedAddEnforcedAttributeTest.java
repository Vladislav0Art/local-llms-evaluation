package org.jsoup.safety;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Attributes;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist = safelist.addEnforcedAttribute("p", "attr", "value");
        Attributes attributes = safelist.getEnforcedAttributes("p");
        Assert.assertEquals("value", attributes.get("attr"));
    }

}