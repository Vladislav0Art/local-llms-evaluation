package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.swing.JEditorPane;

public class GeneratedCreateTextNode[String]

Test {

    @Test
    public void createTextNode[ String]Test() {
        String testText = "Hello World";
        TextNode textNode = new TextNode(testText);
        assertEquals(testText, textNode.text());
    }

}