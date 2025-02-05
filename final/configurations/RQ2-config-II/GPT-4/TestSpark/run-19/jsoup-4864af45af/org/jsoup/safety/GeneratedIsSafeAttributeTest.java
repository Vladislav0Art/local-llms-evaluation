package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("div", "id");
        Element element = new Element("div");
        element.attr("id", "20");
        Attribute attribute = new Attribute("id", "20");
        Assert.assertTrue(safelist.isSafeAttribute("div", element, attribute));
        Attribute unsafeAttr = new Attribute("class", "highlight");
        Assert.assertFalse(safelist.isSafeAttribute("div", element, unsafeAttr));
    }

}