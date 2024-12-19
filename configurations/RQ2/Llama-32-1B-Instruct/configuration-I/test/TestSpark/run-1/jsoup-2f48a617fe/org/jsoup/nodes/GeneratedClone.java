package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedClone {

    private String data;

    @Test
    public void clone() {
        Comment otherComment = new Comment("Other comment data");
        assertTrue(comment.clone().getData().equals(otherComment.getData()));
        assertFalse(comment.clone().isXmlDeclaration());
        assertTrue(comment.clone().asXmlDeclaration().isXmlDeclaration());
    }

}