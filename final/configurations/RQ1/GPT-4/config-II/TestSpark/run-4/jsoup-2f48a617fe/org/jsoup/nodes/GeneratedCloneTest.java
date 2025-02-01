package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test");
        Comment cloneComment = comment.clone();
        assertEquals(comment.getData(), cloneComment.getData());
    }

}