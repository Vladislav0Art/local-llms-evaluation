package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Document document = new Document();
        Addable accum = document.add(Comment.class);
        int depth = 0;
        appendTo(document, accum, depth);

        // Adding another Comment at the end of the doc
        addComment(document, "This is a comment");

        assertEquals("<!-- This is an XML declaration -->", accumulate.toString());
    }

}