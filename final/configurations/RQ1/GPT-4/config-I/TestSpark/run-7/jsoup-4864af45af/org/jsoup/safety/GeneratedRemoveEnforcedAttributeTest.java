package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute("a", "href", "www.sample.com");
        safelist.removeEnforcedAttribute("a", "href");
        Assert.assertFalse(safelist.getEnforcedAttributes("a").hasKey("href"));
    }

}