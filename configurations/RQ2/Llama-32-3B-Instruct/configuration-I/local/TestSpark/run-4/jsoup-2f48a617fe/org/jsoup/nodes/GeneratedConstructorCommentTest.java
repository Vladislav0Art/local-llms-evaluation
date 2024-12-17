package org.jsoup.nodes;

import org.jsoup.nodes.Comment;

import java.io.IOException;

public class GeneratedConstructorCommentTest {

    @Test
    public void constructorCommentTest() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}