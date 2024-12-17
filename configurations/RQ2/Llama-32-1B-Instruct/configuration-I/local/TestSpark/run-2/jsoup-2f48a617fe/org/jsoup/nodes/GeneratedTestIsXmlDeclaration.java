package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestIsXmlDeclaration {

    @Test
    public void testIsXmlDeclaration() {
        String COMMENT_DATA = "This is a test comment";
        Comment comment = new Comment(COMMENT_DATA);
        assertTrue(comment.isXmlDeclaration());
    }

}