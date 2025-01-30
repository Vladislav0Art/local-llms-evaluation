package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test comment");
        Comment clonedComment = comment.clone();
        assertEquals(comment.getData(), clonedComment.getData());
        assertNotSame(comment, clonedComment);
    }

}