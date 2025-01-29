package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedIsBlank_test {

    @Test
    public void isBlank_test() {
        String text = "Hello, World! ";
        TextNode node = new TextNode(text);
        assertFalse(node.isBlank());
    }

}