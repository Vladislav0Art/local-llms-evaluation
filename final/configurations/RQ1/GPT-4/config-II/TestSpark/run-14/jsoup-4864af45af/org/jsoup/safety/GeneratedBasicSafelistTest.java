package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedBasicSafelistTest {

    @Test
    public void basicSafelistTest() {
        Safelist safelist = Safelist.basic();

        Element el = new Element("a");
        el.attr("href", "https://google.com");

        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertTrue(safelist.isSafeAttribute("a", el, el.attr("href")));
    }

}