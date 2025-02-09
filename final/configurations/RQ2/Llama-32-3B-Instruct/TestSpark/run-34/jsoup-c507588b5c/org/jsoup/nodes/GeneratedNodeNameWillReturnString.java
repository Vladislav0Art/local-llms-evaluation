package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;

public class GeneratedNodeNameWillReturnString {

    @Test
    public void nodeNameWillReturnString() {
        TextNode node = new TextNode("text");
        String expected = "text";
        assertEquals(expected, (String) node.nodeName());
    }

}