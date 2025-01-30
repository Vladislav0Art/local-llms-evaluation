package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("CloneMe");
        TextNode clone = textNode.clone();

        Assert.assertNotSame(textNode, clone);
        Assert.assertEquals(textNode.toString(), clone.toString());
    }

}