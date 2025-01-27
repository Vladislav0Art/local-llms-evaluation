package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedNodeNameNonBlankText {

    @Test
    public void nodeNameNonBlankText() {
        String text = "Test";
        TextNode textNode = new TextNode(text);
        assertEquals("text", textNode.nodeName());
    }

}