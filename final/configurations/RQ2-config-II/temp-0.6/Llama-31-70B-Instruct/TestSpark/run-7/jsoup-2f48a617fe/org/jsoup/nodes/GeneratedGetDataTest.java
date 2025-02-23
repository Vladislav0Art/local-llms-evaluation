package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedGetDataTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Test Data");
        assertEquals("Test Data", comment.getData());
    }

}