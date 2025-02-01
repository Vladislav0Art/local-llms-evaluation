package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("!Test");
        assertTrue(comment.isXmlDeclaration());
        Comment comment2 = new Comment("?Test");
        assertTrue(comment2.isXmlDeclaration());
        Comment comment3 = new Comment("Test");
        assertFalse(comment3.isXmlDeclaration());
    }

}