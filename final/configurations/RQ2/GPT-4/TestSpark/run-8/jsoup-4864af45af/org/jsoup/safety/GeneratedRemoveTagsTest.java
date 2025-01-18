package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        safelist.removeTags("tag2");

        Assert.assertTrue(safelist.isSafeTag("tag1"));
        Assert.assertFalse(safelist.isSafeTag("tag2"));
    }

}