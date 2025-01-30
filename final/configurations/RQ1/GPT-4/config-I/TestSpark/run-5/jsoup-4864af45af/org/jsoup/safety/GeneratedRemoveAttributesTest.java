package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeAttributes("img", "src", "alt");
        Element el = new Element("img");
        el.attr("src", "http://example.com");
        el.attr("alt", "example");
        Attribute attrSrc = el.attributes().get("src");
        Attribute attrAlt = el.attributes().get("alt");
        Assert.assertFalse(safelist.isSafeAttribute("img", el, attrSrc));
        Assert.assertFalse(safelist.isSafeAttribute("img", el, attrAlt));
    }

}