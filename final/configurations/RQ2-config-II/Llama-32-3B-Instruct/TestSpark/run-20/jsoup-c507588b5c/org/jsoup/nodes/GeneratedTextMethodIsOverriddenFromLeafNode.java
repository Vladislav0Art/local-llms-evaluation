package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedTextMethodIsOverriddenFromLeafNode {

    @Test
    public void textMethodIsOverriddenFromLeafNode() {
        LeafNode leafNode = Mockito.mock(LeafNode.class);
        when(leafNode.text()).thenReturn("text");
        TextNode textNode = new TextNode("", leafNode);
        assertEquals("text", textNode.text());
    }

}