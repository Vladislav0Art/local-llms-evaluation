package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.removeEnforcedAttribute("tag", "attribute");
        Assert.assertNotNull(result);
    }

}