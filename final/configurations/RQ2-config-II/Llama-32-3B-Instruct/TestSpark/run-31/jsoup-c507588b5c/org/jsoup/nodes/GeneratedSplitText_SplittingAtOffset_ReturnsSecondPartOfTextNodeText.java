package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitText_SplittingAtOffset_ReturnsSecondPartOfTextNodeText {

    @Test
    public void splitText_SplittingAtOffset_ReturnsSecondPartOfTextNodeText() throws IOException {
        String text = "Hello, World!";
        int offset = 6;
        TextNode textNode = new TextNode(text);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document document = new Document(new Appendable(), null, 0);
        TextNode secondPart = textNode.splitText(offset);
        assertEquals("World!", secondPart.text());
    }

}