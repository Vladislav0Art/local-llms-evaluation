package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Appendable;

public class GeneratedOuterHtmlHeadThrowsIOException {

    @Test
    public void outerHtmlHeadThrowsIOException() {
        Comment comment = new Comment("data");
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        try {
            comment.outerHtmlHead(accum, depth, out);
            assert false : "Expected IOException";
        } catch (IOException e) {
            assertThat(e.getMessage(), is(""));
        }
    }

}