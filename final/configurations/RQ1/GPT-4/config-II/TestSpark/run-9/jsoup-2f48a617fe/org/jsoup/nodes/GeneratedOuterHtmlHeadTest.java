package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        Comment comment = new Comment("test comment");
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint(true);
        comment.outerHtmlHead(stringBuilder, 0, out);

        assertEquals("<!--test comment-->", stringBuilder.toString());
    }

}