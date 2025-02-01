package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCommentConstructorTest {

    @Test
    public void CommentConstructorTest() {
        Comment comment = new Comment("Test comment");
        assertEquals("Test comment", comment.getData());
    }

}