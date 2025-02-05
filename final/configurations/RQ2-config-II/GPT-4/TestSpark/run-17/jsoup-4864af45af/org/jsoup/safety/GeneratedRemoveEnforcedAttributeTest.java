package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.junit.Assert;

import java.util.Set;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("tag1", "attr1", "value1");
        safelist.removeEnforcedAttribute("tag1", "attr1");
        Attributes attrs = safelist.getEnforcedAttributes("tag1");
        Assert.assertFalse(attrs.hasKey("attr1"));
    }

}