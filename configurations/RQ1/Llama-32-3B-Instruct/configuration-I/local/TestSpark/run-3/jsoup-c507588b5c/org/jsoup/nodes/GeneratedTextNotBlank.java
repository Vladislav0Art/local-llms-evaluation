package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTextNotBlank {

    @Test
    public void textNotBlank() {
        TextNode node = new TextNode("Hello");
        assertFalse(node.isBlank());
    }

}