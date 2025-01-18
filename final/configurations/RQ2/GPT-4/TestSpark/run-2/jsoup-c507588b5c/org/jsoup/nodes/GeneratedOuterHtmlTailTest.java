package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        TextNode tn = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        tn.outerHtmlTail(accum, 0, new Document("").outputSettings());
        assertEquals("", accum.toString());
    }

}