package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safeList = new Safelist();
        safeList.addTags("tag1", "tag2");
        safeList.removeTags("tag2");
        Assert.assertFalse(safeList.isSafeTag("tag2"));
    }

}