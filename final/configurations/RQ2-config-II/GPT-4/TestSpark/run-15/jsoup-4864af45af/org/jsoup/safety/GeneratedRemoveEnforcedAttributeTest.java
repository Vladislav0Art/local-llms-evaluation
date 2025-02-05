package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1");
        safelist.addEnforcedAttribute("tag1", "a1", "v1");
        safelist.removeEnforcedAttribute("tag1", "a1");
        Attributes atts = safelist.getEnforcedAttributes("tag1");
        Assert.assertFalse(atts.hasKey("a1"));
    }

}