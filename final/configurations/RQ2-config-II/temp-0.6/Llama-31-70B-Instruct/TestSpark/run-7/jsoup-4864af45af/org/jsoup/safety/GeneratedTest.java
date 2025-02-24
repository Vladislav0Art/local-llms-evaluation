package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Safelist safelist;

    @Test
    public void addTagsTest() {
        String[] tags = new String[]{"tag1", "tag2"};
        Safelist result = safelist.addTags(tags);
        Assert.assertNotNull(result);
    }

    @Test
    public void removeTagsTest() {
        String[] tags = new String[]{"tag1", "tag2"};
        Safelist result = safelist.removeTags(tags);
        Assert.assertNotNull(result);
    }

    @Test
    public void addAttributesTest() {
        String tag = "tag1";
        String[] attributes = new String[]{"attr1", "attr2"};
        Safelist result = safelist.addAttributes(tag, attributes);
        Assert.assertNotNull(result);
    }

    @Test
    public void removeAttributesTest() {
        String tag = "tag1";
        String[] attributes = new String[]{"attr1", "attr2"};
        Safelist result = safelist.removeAttributes(tag, attributes);
        Assert.assertNotNull(result);
    }

}