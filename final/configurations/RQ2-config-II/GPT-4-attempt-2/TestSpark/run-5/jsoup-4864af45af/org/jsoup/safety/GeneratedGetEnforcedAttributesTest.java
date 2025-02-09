package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;

public class GeneratedGetEnforcedAttributesTest {

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = new Safelist();
        Attributes result = safelist.getEnforcedAttributes("Tag");
        Assert.assertNotNull(result);
    }

}