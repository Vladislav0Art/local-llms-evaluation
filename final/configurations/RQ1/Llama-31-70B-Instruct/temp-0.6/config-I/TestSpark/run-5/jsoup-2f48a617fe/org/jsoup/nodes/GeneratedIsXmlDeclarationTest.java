package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("Test Comment");
        assertFalse(comment.isXmlDeclaration());
        comment = new Comment("!Test Comment");
        assertTrue(comment.isXmlDeclaration());
    }

}