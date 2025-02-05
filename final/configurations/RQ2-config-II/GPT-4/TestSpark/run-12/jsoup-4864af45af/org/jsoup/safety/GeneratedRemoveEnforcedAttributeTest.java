package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("Tag1", "Attribute1", "Value1");
        safelist.removeEnforcedAttribute("Tag1", "Attribute1");
        Assert.assertNull(safelist.getEnforcedAttributes("Tag1").get("Attribute1"));
    }

}