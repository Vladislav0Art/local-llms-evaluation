package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedClone_comment_returnsNewComment {

    @Test
    public void clone_comment_returnsNewComment() {
        Comment comment = new Comment("data");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment, clonedComment);
    }

}