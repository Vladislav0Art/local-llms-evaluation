package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());

        comment.setData("newData");
        assertEquals("newData", comment.getData());
    }

}