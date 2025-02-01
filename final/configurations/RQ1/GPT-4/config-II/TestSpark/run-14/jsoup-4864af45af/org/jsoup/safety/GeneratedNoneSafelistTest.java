package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNoneSafelistTest {

    @Test
    public void noneSafelistTest() {
        Safelist safelist = Safelist.none();

        Assert.assertFalse(safelist.isSafeTag("a"));

        Element el = new Element("a");
        el.attr("href", "https://google.com");

        Assert.assertFalse(safelist.isSafeAttribute("a", el, el.attr("href")));
    }

}