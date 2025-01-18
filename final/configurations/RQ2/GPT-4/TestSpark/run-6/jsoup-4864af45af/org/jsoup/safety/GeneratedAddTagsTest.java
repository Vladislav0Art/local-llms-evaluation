package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = Safelist.none().addTags("tag1", "tag2");
        Assert.assertTrue(safelist.isSafeTag("tag1"));
    }

}