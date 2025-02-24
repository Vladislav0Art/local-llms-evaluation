package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test Data");
        Comment commentClone = comment.clone();
        assertNotNull(commentClone);
        assertEquals(comment, commentClone);
    }

}