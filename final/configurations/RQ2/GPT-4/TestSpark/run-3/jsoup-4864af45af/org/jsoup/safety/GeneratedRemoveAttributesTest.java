package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.none().addAttributes("div", "class", "style").removeAttributes("div", "class");
        Assert.assertFalse(safelist.isSafeAttribute("div", null, new org.jsoup.nodes.Attribute("class", "")));
    }

}