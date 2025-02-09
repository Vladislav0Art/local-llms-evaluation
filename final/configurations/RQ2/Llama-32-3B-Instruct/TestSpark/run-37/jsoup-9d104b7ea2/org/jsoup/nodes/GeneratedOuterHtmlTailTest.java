package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        String text = "Hello, World!";
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Appendable accum = new StringBuffer();
        TextNode textNode = new TextNode(text);
        textNode.outerHtmlTail(accum, 0, out);
        assertNotNull(accum.toString());
    }

}