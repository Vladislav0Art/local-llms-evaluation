package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Test Data");
        comment.setData("New Data");
        assertEquals("New Data", comment.getData());
    }

}