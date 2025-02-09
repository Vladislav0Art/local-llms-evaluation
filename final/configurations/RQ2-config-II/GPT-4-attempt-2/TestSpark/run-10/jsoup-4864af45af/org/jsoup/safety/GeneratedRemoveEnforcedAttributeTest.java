package org.jsoup.safety;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Attributes;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist = safelist.addEnforcedAttribute("p", "attr", "value");
        safelist = safelist.removeEnforcedAttribute("p", "attr");
        Attributes attributes = safelist.getEnforcedAttributes("p");
        Assert.assertFalse(attributes.hasKey("attr"));
    }

}