package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;
import org.mockito.SpyBean;

@RunWith(JUnit4.class)
public class GeneratedCreateTextNode_NormalText_ReturnsTextNode {

    @SpyBean
    private LeafNode parentNode;

    @Test
    public void createTextNode_NormalText_ReturnsTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        org.junit.Assert.assertEquals("Hello World", textNode.text());
    }

}