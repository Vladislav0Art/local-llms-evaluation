package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;

public class GeneratedCreateTextNode_EmptyText {

    @Test
    public void createTextNode_EmptyText() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.text().isEmpty());
    }

}