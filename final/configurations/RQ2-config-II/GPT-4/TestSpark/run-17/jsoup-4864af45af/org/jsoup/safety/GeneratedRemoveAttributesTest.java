package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.junit.Assert;

import java.util.Set;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeAttributes("a", "href");
        Element el = new Element("a");
        el.attr("href", "https://example.com");
        Attribute attr = el.attributes().iterator().next();
        Assert.assertFalse(safelist.isSafeAttribute("a", el, attr));
    }

}