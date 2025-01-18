package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none().addAttributes("div", "class", "style");
        Assert.assertTrue(safelist.isSafeAttribute("div", null, new org.jsoup.nodes.Attribute("class", "")));
    }

}