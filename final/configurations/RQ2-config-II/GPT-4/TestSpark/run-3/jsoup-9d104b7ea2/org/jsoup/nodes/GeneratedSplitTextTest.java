package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode tn = new TextNode("TextSplit");
        TextNode splitPart = tn.splitText(4);
        assertEquals("Text", tn.text());
        assertEquals("Split", splitPart.text());
    }

}