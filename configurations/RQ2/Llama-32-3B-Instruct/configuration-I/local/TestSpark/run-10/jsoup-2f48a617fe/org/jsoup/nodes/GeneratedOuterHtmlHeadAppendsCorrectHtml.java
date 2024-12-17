package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class GeneratedOuterHtmlHeadAppendsCorrectHtml {

    @Test
    public void outerHtmlHeadAppendsCorrectHtml() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("Some comment");
        comment.outerHtmlHead(accum, 0, out);
        String expectedHtml = "<!-- Some comment -->";
        assertEquals(expectedHtml, accum.toString());
    }

}