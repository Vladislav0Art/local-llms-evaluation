package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeEnforcedAttribute("a", "rel");
        Element el = new Elements("a");
        el.attr("rel", "nofollow");
        Attribute attr = el.attributes().get("rel");
        Assert.assertFalse(safelist.isSafeAttribute("a", el, attr));
    }

}