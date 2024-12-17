package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateTextNode_LedgingWhitespace {

    @Test
    public void createTextNode_LedgingWhitespace() {
        TextNode node = new TextNode("   \n");
        assertEquals("\n", node.text());
    }

}