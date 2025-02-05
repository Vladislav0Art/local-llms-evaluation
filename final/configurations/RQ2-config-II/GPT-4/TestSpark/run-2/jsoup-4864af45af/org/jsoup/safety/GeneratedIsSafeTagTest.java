package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedIsSafeTagTest {

    @Test
    public void isSafeTagTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("safeTag");
        Assert.assertTrue(safelist.isSafeTag("safeTag"));
        Assert.assertFalse(safelist.isSafeTag("unsafeTag"));
    }

}