package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("data");
        assertFalse(comment.isXmlDeclaration());
        comment.setData("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\" ?>");
        assertTrue(comment.isXmlDeclaration());
    }

}