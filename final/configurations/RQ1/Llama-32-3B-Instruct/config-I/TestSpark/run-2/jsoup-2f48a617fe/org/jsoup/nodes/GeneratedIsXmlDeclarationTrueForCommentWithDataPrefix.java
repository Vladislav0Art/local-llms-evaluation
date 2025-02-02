package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclarationTrueForCommentWithDataPrefix {

    @Test
    public void isXmlDeclarationTrueForCommentWithDataPrefix() {
        Comment comment = new Comment("<!-- This is a comment -->");
        try {
            assertTrue(comment.isXmlDeclaration());
        } catch (IOException e) {
            assert (false);
        }
    }

}