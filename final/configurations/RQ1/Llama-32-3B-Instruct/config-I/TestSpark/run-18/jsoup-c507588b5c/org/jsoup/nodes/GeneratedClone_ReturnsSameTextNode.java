package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedClone_ReturnsSameTextNode {

    @Mock
    private Node parentNode;

    @Test
    public void clone_ReturnsSameTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        TextNode clonedTextNode = (TextNode) textNode.clone();
        assertEquals(text, clonedTextNode.value());
    }

}