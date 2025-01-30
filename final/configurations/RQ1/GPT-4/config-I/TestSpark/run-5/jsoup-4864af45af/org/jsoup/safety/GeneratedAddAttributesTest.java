package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes("img", "src", "alt");
        Element el = new Element("img");
        el.attr("src", "http://example.com");
        el.attr("alt", "example");
        Attribute attrSrc = el.attribute("src");
        Attribute attrAlt = el.attribute("alt");
        Assert.assertTrue(safelist.isSafeAttribute("img", el, attrSrc));
        Assert.assertTrue(safelist.isSafeAttribute("img", el, attrAlt));
    }

}