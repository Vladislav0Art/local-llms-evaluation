package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTail_Test_WithAppendableAndDepth0DoesNotThrowIOException {

    @Test
    public void outerHtmlTail_Test_WithAppendableAndDepth0DoesNotThrowIOException() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 0;
        Document.OutputSettings out = null;
        node.outerHtmlTail(accum, depth, out);
    }

}