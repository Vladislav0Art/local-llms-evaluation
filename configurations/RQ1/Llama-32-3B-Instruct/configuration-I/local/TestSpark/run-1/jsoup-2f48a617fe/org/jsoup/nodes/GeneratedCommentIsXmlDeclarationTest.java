package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedCommentIsXmlDeclarationTest {

    @Test
    public void CommentIsXmlDeclarationTest() {
        Comment comment1 = new Comment("");
        assertTrue(comment1.isXmlDeclaration());

        Comment comment2 = new Comment("This is not an XML Declaration");
        assertFalse(comment2.isXmlDeclaration());

        Comment comment3 = new Comment("!XML Declaration");
        assertTrue(comment3.isXmlDeclaration());
    }

}