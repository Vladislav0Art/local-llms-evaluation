package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        Document.OutputSettings settings = new Document.OutputSettings(true);
        TextNode node = new TextNode("   ");
        node.outerHtmlTail(outStream, 0, settings);
    }

}