package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.swing.JEditorPane;

public class GeneratedSplitTextNode[Int]

Test {

    @Test
    public void splitTextNode[ Int]Test() {
        String testText = "Hello World";
        TextNode textNode = new TextNode(testText);

        int offset1 = 6;
        TextNode tailNode1 = textNode.splitText(offset1);
        assertEquals(testText.substring(0, offset1), tailNode1.text());
        assertEquals(testText.substring(offset1), textNode.text());

        int offset2 = 5;
        TextNode tailNode2 = textNode.splitText(offset2);
        assertEquals(testText.substring(0, offset1), tailNode1.text());
        assertEquals(testText.substring(offset1 + offset2), tailNode2.text());
    }

}