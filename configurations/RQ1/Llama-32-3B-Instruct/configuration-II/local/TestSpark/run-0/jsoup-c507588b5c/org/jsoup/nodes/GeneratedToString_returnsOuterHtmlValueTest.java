package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedToString_returnsOuterHtmlValueTest {

    @Test
    public void toString_returnsOuterHtmlValueTest() {
        TextNode textNode = new TextNode("test");
        String outerHtml = "<p>test</p>";
        assertEquals(outerHtml, textNode.toString());
    }

}