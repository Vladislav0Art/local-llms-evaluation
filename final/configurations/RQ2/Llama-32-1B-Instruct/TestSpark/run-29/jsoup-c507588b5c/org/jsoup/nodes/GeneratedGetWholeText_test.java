package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedGetWholeText_test {

    @Test
    public void getWholeText_test() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("Hello, World!", node.getWholeText());
    }

}