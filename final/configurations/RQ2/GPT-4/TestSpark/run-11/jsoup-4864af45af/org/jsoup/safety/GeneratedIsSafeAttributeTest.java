package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = Safelist.basic();
        Assert.assertTrue(safelist.isSafeAttribute("a", new Element("div"), new Attribute("href", "")));
        Assert.assertFalse(safelist.isSafeAttribute("a", new Element("div"), new Attribute("onclick", "")));
    }

}