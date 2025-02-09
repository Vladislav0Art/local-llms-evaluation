package org.jsoup.safety;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Attributes;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist = safelist.addAttributes("p", "attr");
        Attributes attributes = safelist.getEnforcedAttributes("p");
        Assert.assertTrue(attributes.hasKey("attr"));
    }

}