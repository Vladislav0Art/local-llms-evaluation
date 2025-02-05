package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("Tag1", "Tag2");
        Assert.assertTrue(safelist.isSafeTag("Tag1"));
        Assert.assertFalse(safelist.isSafeTag("Tag3"));
    }

}