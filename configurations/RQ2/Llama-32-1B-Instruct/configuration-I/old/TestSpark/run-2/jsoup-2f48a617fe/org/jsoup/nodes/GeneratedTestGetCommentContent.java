package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetCommentContent {

    @Test
    public void testGetCommentContent() {
        String COMMENT_DATA = "This is a test comment";
        Comment comment = new Comment(COMMENT_DATA);
        assertEquals(COMMENT_DATA, comment.getData());
        assertNotNull(comment.getNodeName());
    }

}