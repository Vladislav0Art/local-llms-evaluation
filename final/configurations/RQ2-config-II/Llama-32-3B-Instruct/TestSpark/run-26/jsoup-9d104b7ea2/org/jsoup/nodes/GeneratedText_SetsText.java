package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedText_SetsText {

    @Test
    public void text_SetsText() {
        TextNode textNode = new TextNode();
        textNode.text("test");
        assertEquals("test", textNode.text());
    }

}