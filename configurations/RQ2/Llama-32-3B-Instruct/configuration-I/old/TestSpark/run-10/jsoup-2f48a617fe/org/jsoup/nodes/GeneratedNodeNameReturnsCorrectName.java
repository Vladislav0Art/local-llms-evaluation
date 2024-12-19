package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class GeneratedNodeNameReturnsCorrectName {

    @Test
    public void nodeNameReturnsCorrectName() {
        Comment comment = new Comment("Some comment");
        assertEquals("comment", comment.nodeName());
    }

}