package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        String COMMENT_DATA = "This is a test comment";
        Comment comment = new Comment(COMMENT_DATA);
        Comment clonedComment = comment.clone();
        assertEquals(comment.getNodeName(), clonedComment.getNodeName());
        assertEquals(COMMENT_DATA, clonedComment.getData());
        assertNotNull(clonedComment.getNodeName());
    }

}