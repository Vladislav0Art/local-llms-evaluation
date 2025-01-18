package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist sl = new Safelist().addTags("tag1", "tag2");
        sl.removeTags("tag1");
        Assert.assertFalse(sl.isSafeTag("tag1"));
        Assert.assertTrue(sl.isSafeTag("tag2"));
    }

}