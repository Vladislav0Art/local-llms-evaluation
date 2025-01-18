package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetEnforcedAttributesTest {

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = Safelist.none().addEnforcedAttribute("div", "class", "test");
        Assert.assertTrue(safelist.getEnforcedAttributes("div").hasKey("class"));
        Assert.assertEquals("test", safelist.getEnforcedAttributes("div").get("class"));
    }

}