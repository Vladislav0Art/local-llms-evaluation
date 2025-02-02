package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlHeadIsCalledWithCorrectData {

    @Test
    public void outerHtmlHeadIsCalledWithCorrectData() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable appendable = outContent;
        int depth = 0;
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        Comment comment = new Comment("Hello World");
        comment.outerHtmlHead(appendable, depth, outputSettings);
        assertEquals("<!--Hello World-->", outContent.toString());
    }

}