package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;

public class GeneratedTextWillReturnString {

    @Test
    public void textWillReturnString() {
        TextNode node = new TextNode("text");
        String expected = "text";
        assertEquals(expected, node.text());
    }

}