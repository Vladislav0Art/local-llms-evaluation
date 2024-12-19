package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedCreateTextNode_textNotNullTest {

    @Test
    public void createTextNode_textNotNullTest() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode.value());
    }

}