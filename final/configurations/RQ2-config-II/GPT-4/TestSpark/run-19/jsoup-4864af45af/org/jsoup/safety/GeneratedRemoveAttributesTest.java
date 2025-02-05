package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("div", "id", "class");
        safelist.removeAttributes("div", "id");
        Attributes attributes = safelist.getEnforcedAttributes("div");
        Assert.assertFalse(attributes.hasKey("id"));
        Assert.assertTrue(attributes.hasKey("class"));
    }

}