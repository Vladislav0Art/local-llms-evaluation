package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test");
        Comment clone = comment.clone();
        assertEquals("test", clone.getData());
    }

}