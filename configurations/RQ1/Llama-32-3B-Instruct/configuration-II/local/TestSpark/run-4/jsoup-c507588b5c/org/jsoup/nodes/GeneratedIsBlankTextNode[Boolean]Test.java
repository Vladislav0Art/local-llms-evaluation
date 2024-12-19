package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.swing.JEditorPane;

public class GeneratedIsBlankTextNode[Boolean]

Test {

    @Test
    public void isBlankTextNode[ Boolean]Test() {
        String testText = "";
        TextNode textNode = new TextNode(testText);
        assertTrue(textNode.isBlank());

        testText = "   ";
        textNode = new TextNode(testText);
        assertFalse(textNode.isBlank());
    }

}