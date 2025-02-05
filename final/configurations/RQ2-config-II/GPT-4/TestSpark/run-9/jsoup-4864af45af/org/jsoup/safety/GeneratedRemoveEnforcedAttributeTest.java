package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safeList = new Safelist();
        safeList.addEnforcedAttribute("tag1", "attr1", "value1");
        safeList.removeEnforcedAttribute("tag1", "attr1");
        Attributes attributes = safeList.getEnforcedAttributes("tag1");
        Assert.assertFalse(attributes.hasKey("attr1"));
    }

}