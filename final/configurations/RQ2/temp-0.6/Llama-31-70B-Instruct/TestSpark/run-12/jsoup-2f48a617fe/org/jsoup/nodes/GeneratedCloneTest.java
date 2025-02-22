package org.jsoup.nodes;

import org.jsoup.nodes.Comment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedCloneTest {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("This is a comment");
    }

    @Test
    public void cloneTest() {
        Comment clone = comment.clone();
        assertNotNull(clone);
        assertEquals(comment.getData(), clone.getData());
    }

}