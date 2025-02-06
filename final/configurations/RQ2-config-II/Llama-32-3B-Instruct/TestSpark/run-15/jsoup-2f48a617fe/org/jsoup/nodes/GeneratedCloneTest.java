package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Comment comment = new Comment("");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment, clonedComment);
    }

}