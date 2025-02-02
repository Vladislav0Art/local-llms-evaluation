package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedCreateCommentWithTextSetsDataProperly {

    @Test
    public void createCommentWithTextSetsDataProperly() {
        Comment comment = new Comment("Some text");
        assertEquals("Some text", comment.getData());
    }

}