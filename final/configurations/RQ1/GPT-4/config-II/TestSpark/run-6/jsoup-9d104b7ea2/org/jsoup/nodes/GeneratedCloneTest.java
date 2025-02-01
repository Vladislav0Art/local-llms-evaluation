package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.StringUtil;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode original = new TextNode("test");
        TextNode clone = original.clone();
        Assert.assertNotSame(original, clone);
        Assert.assertEquals(original.text(), clone.text());
    }

}