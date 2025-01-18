package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = Safelist.none().addTags("div", "p");
        Assert.assertTrue(safelist.isSafeTag("div"));
        Assert.assertTrue(safelist.isSafeTag("p"));
    }

}