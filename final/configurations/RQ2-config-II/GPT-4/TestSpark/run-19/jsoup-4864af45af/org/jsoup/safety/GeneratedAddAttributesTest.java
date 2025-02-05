package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("div", "id", "class");
        Attributes attributes = safelist.getEnforcedAttributes("div");
        Assert.assertTrue(attributes.hasKey("id"));
        Assert.assertTrue(attributes.hasKey("class"));
    }

}