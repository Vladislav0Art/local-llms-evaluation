package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode tn = new TextNode("Text");
        StringWriter sw = new StringWriter();
        tn.outerHtmlHead(sw, 0, new Document.OutputSettings());
        assertEquals("Text", sw.toString());
    }

}