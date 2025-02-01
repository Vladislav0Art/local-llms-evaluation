package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSimpleTextSafelistTest {

    @Test
    public void simpleTextSafelistTest() {
        Safelist safelist = Safelist.simpleText();
        Assert.assertTrue(safelist.isSafeTag("b"));

        Element el = new Element("b");

        Assert.assertTrue(safelist.isSafeAttribute("b", new Element("b"), new Attribute("b", "href", "https://google.com")));
    }

}