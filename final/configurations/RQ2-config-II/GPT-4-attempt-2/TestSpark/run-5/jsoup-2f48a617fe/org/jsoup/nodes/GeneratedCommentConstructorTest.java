package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCommentConstructorTest {

    @Test
    public void CommentConstructorTest() {
        String data = "testdata";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}