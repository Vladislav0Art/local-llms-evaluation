package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("div", "id", "20");
        safelist.removeEnforcedAttribute("div", "id");
        Attributes attributes = safelist.getEnforcedAttributes("div");
        Assert.assertFalse(attributes.hasKey("id"));
    }

}