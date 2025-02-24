package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode node = new TextNode("test");

        String newText = "new text";
        TextNode newNode = node.text(newText);

        assertEquals(newText, newNode.text());
    }

}