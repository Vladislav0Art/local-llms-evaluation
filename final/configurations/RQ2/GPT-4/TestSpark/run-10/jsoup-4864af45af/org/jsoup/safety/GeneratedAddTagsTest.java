package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Safelist sl = new Safelist();
        sl.addTags("tag1", "tag2");
        Assert.assertTrue(sl.isSafeTag("tag1"));
        Assert.assertTrue(sl.isSafeTag("tag2"));
    }

}