package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.mockito.Mockito;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        String tag = "tag";
        safelist.addTags(tag);
        safelist.addEnforcedAttribute(tag, "attr", "value");
        safelist.removeEnforcedAttribute(tag, "attr");
        Assert.assertFalse(safelist.getEnforcedAttributes(tag).hasKey("attr"));
    }

}