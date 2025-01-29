package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedText_blank {

    @Test
    public void text_blank() {
        String text = "";
        TextNode node = new TextNode(text);
        assertFalse(node.isBlank());
    }

}