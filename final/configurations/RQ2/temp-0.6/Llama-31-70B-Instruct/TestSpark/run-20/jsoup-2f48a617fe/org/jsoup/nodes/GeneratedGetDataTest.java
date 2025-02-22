package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedGetDataTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Test comment");
        assertEquals("Test comment", comment.getData());
    }

}