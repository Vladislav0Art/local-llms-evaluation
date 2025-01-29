package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

public class GeneratedGetWholeTextTestsTextNode_getWholeText {

    @Test
    public void getWholeTextTestsTextNode_getWholeText() {
        String text = "Hello, World!";
        TestNode node = new TestNode(text);
        when(node.getWholeText()).thenReturn(text);
        assertEquals(text, node.getWholeText());
    }

}