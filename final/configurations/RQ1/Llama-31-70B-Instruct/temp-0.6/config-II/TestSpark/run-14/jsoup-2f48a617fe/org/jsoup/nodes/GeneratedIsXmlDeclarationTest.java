package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("This is a comment");
        assertFalse(comment.isXmlDeclaration());

        comment = new Comment("! This is an XML Declaration");
        assertTrue(comment.isXmlDeclaration());

        comment = new Comment("? This is an XML Declaration");
        assertTrue(comment.isXmlDeclaration());
    }

}