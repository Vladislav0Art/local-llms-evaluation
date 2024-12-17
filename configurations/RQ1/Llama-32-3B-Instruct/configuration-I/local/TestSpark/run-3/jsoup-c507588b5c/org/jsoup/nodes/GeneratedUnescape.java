package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedUnescape {

    @Test
    public void unescape() {
        TextNode node = new TextNode(HTML);
        StringBuilder sb = new StringBuilder();
        assertEquals("Hello World", Entities.unescape(node.text()), 0, sb);
    }
}

}