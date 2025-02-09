package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.addTags("tag1", "tag2");
        Assert.assertNotNull(result);
    }

}