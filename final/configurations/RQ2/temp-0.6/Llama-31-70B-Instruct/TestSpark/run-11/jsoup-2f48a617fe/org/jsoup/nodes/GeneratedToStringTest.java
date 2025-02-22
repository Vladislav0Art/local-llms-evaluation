package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    public Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("Some data");
    }

    @Test
    public void toStringTest() {
        String expected = "Some data";
        String actual = comment.toString();
        assertEquals(expected, actual);
    }

}