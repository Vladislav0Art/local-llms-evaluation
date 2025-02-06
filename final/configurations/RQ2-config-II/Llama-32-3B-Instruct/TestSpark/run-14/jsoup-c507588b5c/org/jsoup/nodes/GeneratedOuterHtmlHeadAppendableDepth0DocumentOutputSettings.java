package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHeadAppendableDepth0DocumentOutputSettings {

    @Test
    public void outerHtmlHeadAppendableDepth0DocumentOutputSettings() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = Document.OutputSettings.STANDARD;
        TextNode textNode = new TextNode("test");
        textNode.outerHtmlHead(accum, 0, out);
        assertTrue(outContent.toString().contains("<p>test</p>"));
    }

}