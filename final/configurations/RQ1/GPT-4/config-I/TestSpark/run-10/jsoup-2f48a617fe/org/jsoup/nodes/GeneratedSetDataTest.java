package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Test comment");
        comment.setData("Updated test comment");
        assertEquals("Updated test comment", comment.getData());
    }

}