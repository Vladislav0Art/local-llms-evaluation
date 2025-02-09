package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;

public class GeneratedIsSafeTagTest {

    @Test
    public void isSafeTagTest() {
        Safelist safelist = new Safelist();
        boolean result = safelist.isSafeTag("tag");
        Assert.assertFalse(result);
        safelist.addTags("tag");
        result = safelist.isSafeTag("tag");
        Assert.assertTrue(result);
    }

}