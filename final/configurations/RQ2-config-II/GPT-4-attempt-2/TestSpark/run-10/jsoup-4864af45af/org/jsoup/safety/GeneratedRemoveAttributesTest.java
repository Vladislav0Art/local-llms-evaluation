package org.jsoup.safety;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Attributes;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist = safelist.addAttributes("p", "attr");
        safelist = safelist.removeAttributes("p", "attr");
        Attributes attributes = safelist.getEnforcedAttributes("p");
        Assert.assertFalse(attributes.hasKey("attr"));
    }

}