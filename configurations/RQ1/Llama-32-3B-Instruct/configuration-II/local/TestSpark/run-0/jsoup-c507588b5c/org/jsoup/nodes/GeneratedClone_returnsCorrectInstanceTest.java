package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedClone_returnsCorrectInstanceTest {

    @Test
    public void clone_returnsCorrectInstanceTest() {
        TextNode textNode = new TextNode();
        TextNode clonedTextNode = textNode.clone();
        assertTrue(clonedTextNode instanceof TextNode);
    }

}