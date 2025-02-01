package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRelaxedSafelistTest {

    @Test
    public void relaxedSafelistTest() {
        Safelist safelist = Safelist.relaxed();
        Assert.assertTrue(safelist.isSafeTag("div"));

        Element el = new Element("div");
        el.attr("class", "my-class");

        Assert.assertFalse(safelist.isSafeAttribute("div", el, el.attr("class")));
    }

}