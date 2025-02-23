package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("!");
        assertTrue(comment.isXmlDeclaration());

        comment = new Comment("?");
        assertTrue(comment.isXmlDeclaration());

        comment = new Comment("Test data");
        assertFalse(comment.isXmlDeclaration());
    }

}