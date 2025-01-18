package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.none().addEnforcedAttribute("div", "class", "test").removeEnforcedAttribute("div", "class");
        Assert.assertFalse(safelist.getEnforcedAttributes("div").hasKey("class"));
    }

}