package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safeList = new Safelist();
        safeList.addEnforcedAttribute("tag1", "attr1", "value1");
        Attributes attributes = safeList.getEnforcedAttributes("tag1");
        Assert.assertTrue(attributes.hasKey("attr1"));
    }

}