package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Document document = new Document();
        Addable accum = document.add(Comment.class);
        int depth = 0;
        appendTo(document, accum, depth);
        assertEquals("<!-- This is a comment -->", accumulate.toString());
    }

}