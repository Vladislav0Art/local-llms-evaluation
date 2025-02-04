package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedOuterHtmlHead_AppendsToStream {

    @Test
    public void outerHtmlHead_AppendsToStream() throws IOException {
        Appendable accum = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("<p>Hello World</p>");
        textNode.outerHtmlHead(accum, 0, out);
        String result = accum.toString();
        assertTrue(result.contains("<p>"));
    }

}