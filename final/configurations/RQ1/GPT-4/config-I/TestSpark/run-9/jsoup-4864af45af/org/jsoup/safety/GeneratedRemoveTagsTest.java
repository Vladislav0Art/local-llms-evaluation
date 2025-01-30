package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("div", "p");
        safelist.removeTags("div");
        Assert.assertFalse(safelist.isSafeTag("div"));
        Assert.assertTrue(safelist.isSafeTag("p"));
    }

}