package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateTextNode_TrailingWhitespace {

    @Test
    public void createTextNode_TrailingWhitespace() {
        TextNode node = new TextNode("   ");
        assertEquals("   ", node.text());
    }

}