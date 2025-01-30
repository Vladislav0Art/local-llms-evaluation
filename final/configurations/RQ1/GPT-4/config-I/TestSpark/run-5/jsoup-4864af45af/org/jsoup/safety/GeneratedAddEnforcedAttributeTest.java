package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute("a", "rel", "nofollow");
        Element el = new Element("a");
        el.attr("rel", "nofollow");
        Attribute attr = el.attributes().get("rel");
        Assert.assertTrue(safelist.isSafeAttribute("a", el, attr));
    }

}