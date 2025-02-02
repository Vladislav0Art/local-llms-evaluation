package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        String text = "Hello World";
        Document doc = new Document(text);
        Appendable accum = mock(Appendable.class);
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = doc.getNodes().get(0);
        textNode.outerHtmlTail(accum, depth, out);
        assertEquals("", accum.toString());
    }

}