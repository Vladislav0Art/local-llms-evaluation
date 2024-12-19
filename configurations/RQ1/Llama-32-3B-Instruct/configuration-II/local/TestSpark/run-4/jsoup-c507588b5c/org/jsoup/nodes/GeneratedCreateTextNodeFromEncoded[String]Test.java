package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.swing.JEditorPane;

public class GeneratedCreateTextNodeFromEncoded[String]

Test {

    @Test
    public void createTextNodeFromEncoded[ String]Test() {
        String encodedText = "&lt;Hello World&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello World", textNode.text());

        encodedText = "   ";
        textNode = TextNode.createFromEncoded(encodedText);
        assertNull(textNode.text());
    }

}