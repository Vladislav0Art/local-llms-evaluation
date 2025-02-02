package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedCreateCommentFromEmptyStringCreatesBlankComment {

    @Test
    public void createCommentFromEmptyStringCreatesBlankComment() {
        Comment comment = new Comment("");
        assertEquals("#comment", comment.nodeName());
        assertNull(comment.getData());
    }

}