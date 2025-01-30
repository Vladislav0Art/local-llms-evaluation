package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment1 = new Comment("!test");
        Comment comment2 = new Comment("?test");
        Comment comment3 = new Comment("test");
        assertTrue(comment1.isXmlDeclaration());
        assertTrue(comment2.isXmlDeclaration());
        assertFalse(comment3.isXmlDeclaration());
    }

}