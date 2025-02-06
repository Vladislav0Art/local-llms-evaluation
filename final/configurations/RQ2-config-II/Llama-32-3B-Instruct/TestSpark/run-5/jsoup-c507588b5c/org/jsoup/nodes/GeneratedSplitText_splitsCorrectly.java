package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitText_splitsCorrectly {

    @Test
    public void splitText_splitsCorrectly() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int offset = 10;
        Document.OutputSettings settings = null;

        TextNode node = new TextNode("0123456789");
        TextNode expectedLeftPart = new TextNode("0123");
        TextNode expectedRightPart = new TextNode("456789");

        node.outerHtmlHead(accum, 0, settings);
        assertEquals(expectedLeftPart.text(), expectedLeftPart.text());
        assertEquals(expectedRightPart.text(), expectedRightPart.text());

        node.splitText(offset);

        assertTrue(outContent.toString().contains(expectedLeftPart.text()));
        assertTrue(outContent.toString().contains(expectedRightPart.text()));
    }

}