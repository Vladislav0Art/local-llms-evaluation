package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("hello");
        Comment clone = (Comment) comment.clone();
        assertEquals("hello", clone.getData());
    }

}