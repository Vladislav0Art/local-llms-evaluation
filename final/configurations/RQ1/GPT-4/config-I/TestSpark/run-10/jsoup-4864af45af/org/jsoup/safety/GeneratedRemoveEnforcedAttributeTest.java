package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeEnforcedAttribute("a", "rel");

        Assert.assertFalse(safelist.isSafeAttribute("a", new Element("a"), new Attribute("rel", "nofollow")));
    }

}