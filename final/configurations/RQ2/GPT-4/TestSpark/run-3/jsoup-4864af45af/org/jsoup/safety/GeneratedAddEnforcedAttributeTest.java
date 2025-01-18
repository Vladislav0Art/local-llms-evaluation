package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.none().addEnforcedAttribute("div", "class", "test");
        Assert.assertEquals("test", safelist.getEnforcedAttributes("div").get("class"));
    }

}