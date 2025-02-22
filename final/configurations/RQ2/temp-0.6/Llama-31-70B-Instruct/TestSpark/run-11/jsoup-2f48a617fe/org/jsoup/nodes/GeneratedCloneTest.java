package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    public Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("Some data");
    }

    @Test
    public void cloneTest() {
        Comment expected = comment;
        Comment actual = comment.clone();
        assertEquals(expected, actual);
    }

}