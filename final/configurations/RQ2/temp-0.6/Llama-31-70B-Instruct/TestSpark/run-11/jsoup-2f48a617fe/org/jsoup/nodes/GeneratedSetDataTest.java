package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetDataTest {

    public Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("Some data");
    }

    @Test
    public void setDataTest() {
        String expected = "New data";
        comment.setData("New data");
        String actual = comment.getData();
        assertEquals(expected, actual);
    }

}