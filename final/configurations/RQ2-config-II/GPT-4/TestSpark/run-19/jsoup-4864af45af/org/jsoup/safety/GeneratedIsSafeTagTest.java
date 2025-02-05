package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class GeneratedIsSafeTagTest {

    @Test
    public void isSafeTagTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("h1", "h2");
        Assert.assertTrue(safelist.isSafeTag("h1"));
        Assert.assertTrue(safelist.isSafeTag("h2"));
        Assert.assertFalse(safelist.isSafeTag("h3"));
    }

}