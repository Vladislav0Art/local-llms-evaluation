package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

public class GeneratedNodeName TestsTextNodenodeName {

    @Test
    public void nodeName

    TestsTextNodenodeName() {
        String text = "Hello, World!";
        TestNode node = new TestNode(text);
        when(node.nodeName()).thenReturn("text");
        assertEquals("text", node.nodeName());
    }

}