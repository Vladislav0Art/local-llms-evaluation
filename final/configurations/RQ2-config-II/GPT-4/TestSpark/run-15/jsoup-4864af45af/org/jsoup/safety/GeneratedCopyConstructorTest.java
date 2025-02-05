package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCopyConstructorTest {

    @Test
    public void copyConstructorTest() {
        Safelist safelist1 = new Safelist();
        safelist1.addTags("tag1");
        Safelist safelist2 = new Safelist(safelist1);
        Assert.assertTrue(safelist2.isSafeTag("tag1"));
    }

}