package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestTextSetter {

    @Test
    public void testTextSetter() {
        TextNode textNode = new TextNode("text");
        textNode.text("new text");
        Assert.assertEquals("new text", textNode.coreValue());
    }

}