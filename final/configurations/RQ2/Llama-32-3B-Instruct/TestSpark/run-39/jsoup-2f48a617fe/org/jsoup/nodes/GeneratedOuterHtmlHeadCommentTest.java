package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedOuterHtmlHeadCommentTest {

    @Test
    public void outerHtmlHeadCommentTest() throws IOException {
        Comment comment = new Comment("");
        Appendable accum = new java.util.ArrayList<>();
        int depth = 0;
        Document.OutputSettings out = null;
        comment.outerHtmlHead(accum, depth, out);
    }

}