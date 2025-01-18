package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetEnforcedAttributesTest {

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = Safelist.basic();
        Attributes attributes = safelist.getEnforcedAttributes("a");
        Assert.assertTrue(attributes.hasKey("rel"));
    }

}