package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.mockito.Mockito;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        String tag = "tag";
        safelist.addTags(tag);
        safelist.addEnforcedAttribute(tag, "attr", "value");
        Assert.assertTrue(safelist.getEnforcedAttributes(tag).hasKey("attr"));
    }

}