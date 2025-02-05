package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Safelist safeList = new Safelist();
        safeList.addTags("tag1", "tag2");
        Assert.assertTrue(safeList.isSafeTag("tag1"));
        Assert.assertTrue(safeList.isSafeTag("tag2"));
    }

}