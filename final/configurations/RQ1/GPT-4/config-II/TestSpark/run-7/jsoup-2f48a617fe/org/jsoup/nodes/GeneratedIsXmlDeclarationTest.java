package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment1 = new Comment("!XML");
        Comment comment2 = new Comment("?XML");
        Comment comment3 = new Comment("XML");
        assertTrue(comment1.isXmlDeclaration());
        assertTrue(comment2.isXmlDeclaration());
        assertFalse(comment3.isXmlDeclaration());
    }

}