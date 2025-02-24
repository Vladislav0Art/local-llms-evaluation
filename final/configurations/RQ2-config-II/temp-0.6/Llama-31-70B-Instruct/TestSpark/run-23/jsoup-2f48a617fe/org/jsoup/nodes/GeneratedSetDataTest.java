package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("data");
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

}