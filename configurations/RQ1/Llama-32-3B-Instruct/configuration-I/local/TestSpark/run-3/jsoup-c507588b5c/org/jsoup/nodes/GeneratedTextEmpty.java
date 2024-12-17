package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTextEmpty {

    @Test
    public void textEmpty() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}