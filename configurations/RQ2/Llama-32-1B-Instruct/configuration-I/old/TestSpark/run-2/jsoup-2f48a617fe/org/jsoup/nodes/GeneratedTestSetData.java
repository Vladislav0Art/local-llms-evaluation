package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetData {

    @Test
    public void testSetData() {
        String COMMENT_DATA = "This is a test comment";
        Comment comment = new Comment(COMMENT_DATA);
        comment.setData("New content");
        assertEquals("New content", comment.getData());
        verifyAnyOf(comment).setData(null);
    }

}