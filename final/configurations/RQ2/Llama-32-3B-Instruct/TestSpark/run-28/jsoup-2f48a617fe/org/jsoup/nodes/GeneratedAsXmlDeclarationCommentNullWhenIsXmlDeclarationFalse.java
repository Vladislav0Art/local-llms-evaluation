package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedAsXmlDeclarationCommentNullWhenIsXmlDeclarationFalse {

    @Test
    public void asXmlDeclarationCommentNullWhenIsXmlDeclarationFalse() {
        Comment comment = new Comment("data");
        assertNotNull(comment.asXmlDeclaration());
        assertTrue(comment.isXmlDeclaration());
    }

}