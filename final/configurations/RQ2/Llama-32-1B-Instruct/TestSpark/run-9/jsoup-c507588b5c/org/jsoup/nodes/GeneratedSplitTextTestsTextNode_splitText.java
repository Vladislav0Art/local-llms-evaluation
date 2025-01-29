package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

public class GeneratedSplitTextTestsTextNode_splitText {

    @Test
    public void splitTextTestsTextNode_splitText() {
        String text = "Hello, World!";
        TestNode node = new TestNode(text);
        when(node.splitText(0)).thenReturn(new TextNode(""));
        assertEquals(new TextNode(""), node.splitText(0));
    }

}