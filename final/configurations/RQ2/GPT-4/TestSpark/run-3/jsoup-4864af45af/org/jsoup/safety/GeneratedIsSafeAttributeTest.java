package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = Safelist.none().addAttributes("div", "class");
        Assert.assertTrue(safelist.isSafeAttribute("div", null, new org.jsoup.nodes.Attribute("class", "")));
        Assert.assertFalse(safelist.isSafeAttribute("div", null, new org.jsoup.nodes.Attribute("style", "")));
    }

}