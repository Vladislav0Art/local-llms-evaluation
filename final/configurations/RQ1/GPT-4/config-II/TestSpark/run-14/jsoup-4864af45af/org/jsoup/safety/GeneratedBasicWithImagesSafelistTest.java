package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedBasicWithImagesSafelistTest {

    @Test
    public void basicWithImagesSafelistTest() {
        Safelist safelist = Safelist.basicWithImages();
        Assert.assertTrue(safelist.isSafeTag("img"));

        Element el = new Element("img");
        el.attr("src", "https://google.com/img.jpg");

        Assert.assertTrue(safelist.isSafeAttribute("img", el, el.attr("src")));
    }

}