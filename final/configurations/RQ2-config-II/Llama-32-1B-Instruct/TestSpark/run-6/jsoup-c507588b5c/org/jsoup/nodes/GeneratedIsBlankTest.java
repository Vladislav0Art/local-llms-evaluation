package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
        Mockito.when(node.toString()).thenReturn(text);
    }

}