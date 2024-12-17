package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCommentCreation {

    @Test
    public void testCommentCreation() {
        String COMMENT_DATA = "This is a test comment";
        Comment comment = new Comment(COMMENT_DATA);
        assertEquals(COMMENT_DATA, comment.getNodeData());
        assertNotNull(comment.getNodeName());
        verifyAnyOf(comment).setNodeValue(null);
    }

}