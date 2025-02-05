package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    private static final Document.OutputSettings outputSettings = new Document.OutputSettings();

    @Test
    public void cloneTest() {
        String text = "example text";
        TextNode textNode = new TextNode(text);
        TextNode clone = textNode.clone();
        Assert.assertEquals(textNode.text(), clone.text());
        Assert.assertFalse(textNode == clone);
    }

}