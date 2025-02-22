package org.jsoup.nodes;

import org.jsoup.nodes.Comment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedSetDataTest {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("This is a comment");
    }

    @Test
    public void setDataTest() {
        comment.setData("This is a new comment");
        assertEquals("This is a new comment", comment.getData());
    }

}