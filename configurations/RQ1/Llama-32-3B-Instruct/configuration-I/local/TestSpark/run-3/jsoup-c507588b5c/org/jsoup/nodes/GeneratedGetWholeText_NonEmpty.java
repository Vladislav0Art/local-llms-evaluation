package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetWholeText_NonEmpty {

    @Test
    public void getWholeText_NonEmpty() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals("Hello World", node.getWholeText());
    }
}

}