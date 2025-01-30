package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href", "style");
        safelist.addTags("a");
        Element element = new Element("a");
        element.attr("href", "http://fakeurl.com");
        element.attr("style", "color: Red");
        safelist.removeAttributes("a", "style");
        Assert.assertTrue(safelist.isSafeAttribute("a", element, new Attribute("href", "http://fakeurl.com")));
        Assert.assertFalse(safelist.isSafeAttribute("a", element, new Attribute("style", "color: Red")));
    }

}