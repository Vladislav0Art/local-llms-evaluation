package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedOuterHtmlHead_emptyText_ThrowsIOException {

    @Test
    public void outerHtmlHead_emptyText_ThrowsIOException() throws IOException {
        Document document = new Document();
        Appendable accum = new ByteArrayOutputStream();
        int depth = 0;
        Document.OutputSettings out = null;
        TextNode textNode = new TextNode("");
        textNode.outerHtmlHead(accum, depth, out);
        assertTrue(document.getOutputString().contains("<p></p>"));
    }

}