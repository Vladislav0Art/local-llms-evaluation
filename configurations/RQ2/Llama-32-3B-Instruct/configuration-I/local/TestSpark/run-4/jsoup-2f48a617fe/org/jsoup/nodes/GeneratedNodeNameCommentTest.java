package org.jsoup.nodes;

import org.jsoup.nodes.Comment;

import java.io.IOException;

public class GeneratedNodeNameCommentTest {

    @Test
    public void nodeNameCommentTest() {
        Comment comment = new Comment("test");
        assertEquals("comment", comment.nodeName());
    }

}