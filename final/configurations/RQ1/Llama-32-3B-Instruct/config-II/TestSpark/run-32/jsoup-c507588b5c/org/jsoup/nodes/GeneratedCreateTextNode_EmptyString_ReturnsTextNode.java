package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;
import org.mockito.SpyBean;

@RunWith(JUnit4.class)
public class GeneratedCreateTextNode_EmptyString_ReturnsTextNode {

    @SpyBean
    private LeafNode parentNode;

    @Test
    public void createTextNode_EmptyString_ReturnsTextNode() {
        String text = "";
        TextNode textNode = new TextNode(text);
        org.junit.Assert.assertNotNull(textNode);
    }

}