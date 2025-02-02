package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedOuterHtmlForCommentWithDataIncludesComment {

    @Test
    public void outerHtmlForCommentWithDataIncludesComment() {
        Comment comment = new Comment("#comment");
        Document document = Document.valueOf(comment);
        element = document.body().children().first();
        element.outerHtmlHead(new StringBuilder(), 0, out);
    }

}