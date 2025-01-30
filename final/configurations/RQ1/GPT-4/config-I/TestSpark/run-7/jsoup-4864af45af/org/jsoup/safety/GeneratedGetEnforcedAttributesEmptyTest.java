package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetEnforcedAttributesEmptyTest {

    @Test
    public void getEnforcedAttributesEmptyTest() {
        Safelist safelist = Safelist.none();
        Assert.assertTrue(safelist.getEnforcedAttributes("a").isEmpty());
    }

}