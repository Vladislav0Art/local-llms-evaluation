package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes("a", "href");

        Element el = new Element("a");
        el.attr("href", "https://google.com");

        Assert.assertTrue(safelist.isSafeAttribute("a", el, el.attr("href")));
    }

}