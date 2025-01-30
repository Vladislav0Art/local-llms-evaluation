package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Initial Data");
        comment.setData("Changed Data");
        assertEquals("Changed Data", comment.getData());
    }

}