package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment1 = new Comment("?xml version='1.0' encoding='UTF-8'");
        assertTrue(comment1.isXmlDeclaration());

        Comment comment2 = new Comment("This is not a XML Declaration");
        assertFalse(comment2.isXmlDeclaration());
    }

}