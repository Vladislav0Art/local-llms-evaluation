package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedCommentCloneTest {

    @Test
    public void CommentCloneTest() {
        Comment comment = new Comment("data");
        Comment clone = comment.clone();
        assertEquals(clone.getData(), comment.getData());
    }

}