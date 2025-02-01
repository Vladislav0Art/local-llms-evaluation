package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment originalComment = new Comment("test data");
        Comment clonedComment = originalComment.clone();
        assertNotSame(originalComment, clonedComment);
        assertEquals(originalComment.getData(), clonedComment.getData());
    }

}