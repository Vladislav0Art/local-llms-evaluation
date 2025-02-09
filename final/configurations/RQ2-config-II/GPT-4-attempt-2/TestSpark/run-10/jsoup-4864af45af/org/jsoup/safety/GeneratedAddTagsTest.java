package org.jsoup.safety;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Attributes;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        safelist = safelist.addTags("p");
        Assert.assertTrue(safelist.isSafeTag("p"));
    }

}