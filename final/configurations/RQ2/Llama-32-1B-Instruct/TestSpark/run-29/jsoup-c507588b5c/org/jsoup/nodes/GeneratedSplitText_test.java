package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedSplitText_test {

    @Test
    public void splitText_test() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals(8, node.splitText(0).text().length());
        // assertEqual(5, node.splitText(2));
    }

}