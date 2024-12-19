package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.swing.JEditorPane;

public class GeneratedCloneTextNode[TextNode]

Test {

    @Test
    public void cloneTextNode[ TextNode]Test() {
        String testText = "Hello World";
        TextNode textNode = new TextNode(testText);
        TextNode clonedTextNode = textNode.clone();
        assertTrue(clonedTextNode instanceof TextNode);
        assertEquals(testText, clonedTextNode.text());
    }

}