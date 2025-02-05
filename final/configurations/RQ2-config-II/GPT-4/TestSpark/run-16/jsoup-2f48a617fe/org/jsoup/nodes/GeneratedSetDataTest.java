package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test comment");
        comment.setData("new test comment");
        assertEquals("new test comment", comment.getData());
    }

}