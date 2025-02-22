package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("!");
        assertTrue(comment.isXmlDeclaration());

        Comment comment2 = new Comment("?");
        assertTrue(comment2.isXmlDeclaration());

        Comment comment3 = new Comment("data");
        assertFalse(comment3.isXmlDeclaration());
    }

}