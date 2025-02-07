package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedClone_MockText {

    @Test
    public void clone_MockText() throws IOException {
        String text = "Hello World";
        TextNode clonedNode = new TextNode(text.clone());
        assertEquals(text, clonedNode.text());
    }

}