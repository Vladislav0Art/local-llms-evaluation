package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode tn = new TextNode("Text");
        StringWriter sw = new StringWriter();
        tn.outerHtmlTail(sw, 0, new Document.OutputSettings());
        assertEquals("", sw.toString());
    }

}