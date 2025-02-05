package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextSetTextTest {

    @Test
    public void textSetTextTest() {
        String newText = "new text";
        TextNode node = new TextNode("sample text");
        node.text(newText);
        assertEquals(newText, node.text());
    }

}