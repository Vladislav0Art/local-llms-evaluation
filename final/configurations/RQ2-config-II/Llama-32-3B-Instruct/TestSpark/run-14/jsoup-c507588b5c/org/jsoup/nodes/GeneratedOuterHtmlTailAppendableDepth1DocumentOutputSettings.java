package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTailAppendableDepth1DocumentOutputSettings {

    @Test
    public void outerHtmlTailAppendableDepth1DocumentOutputSettings() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = Document.OutputSettings.STANDARD;
        TextNode textNode = new TextNode("test");
        textNode.outerHtmlTail(accum, 1, out);
        assertTrue(outContent.toString().contains("</p>"));
    }

}