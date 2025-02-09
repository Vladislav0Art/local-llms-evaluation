package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("data");
        comment.setData("newdata");
        assertEquals("newdata", comment.getData());
    }

}