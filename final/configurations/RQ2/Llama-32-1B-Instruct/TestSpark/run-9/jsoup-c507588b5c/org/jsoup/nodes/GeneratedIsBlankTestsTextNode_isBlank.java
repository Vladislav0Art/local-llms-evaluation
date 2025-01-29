package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

public class GeneratedIsBlankTestsTextNode_isBlank {

    @Test
    public void isBlankTestsTextNode_isBlank() {
        String text = "";
        TestNode node = new TestNode(text);
        when(node.isBlank()).thenReturn(true);
        assertTrue(node.isBlank());
    }

}