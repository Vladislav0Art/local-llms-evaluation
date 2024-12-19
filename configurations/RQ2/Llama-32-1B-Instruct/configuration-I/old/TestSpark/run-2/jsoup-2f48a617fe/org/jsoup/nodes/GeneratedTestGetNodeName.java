package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetNodeName {

    @Test
    public void testGetNodeName() {
        String COMMENT_DATA = "This is a test comment";
        Comment comment = new Comment(COMMENT_DATA);
        assertEquals("comment", comment.getNodeName());
    }

}