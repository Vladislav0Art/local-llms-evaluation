package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutlineTag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Test Case");
        TextNode clone = textNode.clone();
        Assert.assertNotEquals(System.identityHashCode(textNode), System.identityHashCode(clone));
        Assert.assertEquals(textNode.text(), clone.text());
    }

}