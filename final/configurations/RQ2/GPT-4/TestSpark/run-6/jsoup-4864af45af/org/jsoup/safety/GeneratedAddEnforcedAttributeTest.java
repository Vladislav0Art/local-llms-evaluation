package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.none().addEnforcedAttribute("tag1", "attr1", "val1");
        Attributes attrs = safelist.getEnforcedAttributes("tag1");
        Assert.assertTrue(attrs.hasKey("attr1"));
    }

}