package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedGetEnforcedAttributesTest {

    @Test
    public void getEnforcedAttributesTest() {
        String tag = "tag";
        String attribute = "attr";
        String value = "val";
        Safelist safelist = new Safelist().addEnforcedAttribute(tag, attribute, value);
        Attributes enforcedAttributes = safelist.getEnforcedAttributes(tag);
        Assert.assertEquals(value, enforcedAttributes.get(attribute));
    }

}