package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHead_Test_WithAppendableAndDepth0ThrowsIOException {

    @Test
    public void outerHtmlHead_Test_WithAppendableAndDepth0ThrowsIOException() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 0;
        Document.OutputSettings out = null;
        try {
            node.outerHtmlHead(accum, depth, out);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

}