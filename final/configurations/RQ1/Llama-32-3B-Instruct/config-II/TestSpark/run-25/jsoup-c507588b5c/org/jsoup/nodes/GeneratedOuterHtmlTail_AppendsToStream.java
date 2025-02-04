package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedOuterHtmlTail_AppendsToStream {

    @Test
    public void outerHtmlTail_AppendsToStream() throws IOException {
        Appendable accum = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlTail(accum, 0, out);
        String result = accum.toString();
        assertTrue(result.contains(""));
    }

}