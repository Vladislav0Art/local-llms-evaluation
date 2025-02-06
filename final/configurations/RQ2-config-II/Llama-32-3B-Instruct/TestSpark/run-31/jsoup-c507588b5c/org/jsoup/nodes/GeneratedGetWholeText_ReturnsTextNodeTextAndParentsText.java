package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetWholeText_ReturnsTextNodeTextAndParentsText {

    @Test
    public void getWholeText_ReturnsTextNodeTextAndParentsText() throws IOException {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document document = new Document(new Appendable(), null, 0);
        textNode.outerHtmlHead(out, 1, document.getOutputSettings());
        assertEquals(text, out.toString().trim());
    }

}