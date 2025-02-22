package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Some data");
        Comment clonedComment = (Comment) comment.clone();
        assertNotSame(comment, clonedComment);
        assertEquals(comment.getData(), clonedComment.getData());
    }

}