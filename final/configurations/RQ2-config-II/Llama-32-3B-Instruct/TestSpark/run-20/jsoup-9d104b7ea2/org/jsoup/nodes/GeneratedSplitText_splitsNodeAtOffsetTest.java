package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitText_splitsNodeAtOffsetTest {

    @Test
    public void splitText_splitsNodeAtOffsetTest() throws IOException {
        String text = "Hello World!";
        int offset = 6;
        TextNode node = new TextNode(text);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode splitText = node.splitText(offset);
        splitText.outerHtmlHead(accum, 0, out);
        assertEquals("Hello ", outContent.toString());
    }

}