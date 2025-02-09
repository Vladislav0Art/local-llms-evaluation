package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsAnything.anything;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        Assert.assertTrue(safelist.isSafeTag("tag1"));
        Assert.assertTrue(safelist.isSafeTag("tag2"));
    }

}