package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment xmlDeclareComment = new Comment("!?xml version=\"1.0\" encoding=\"UTF-8\"?");
        assertTrue(xmlDeclareComment.isXmlDeclaration());

        Comment normalComment = new Comment("Normal Comment");
        assertFalse(normalComment.isXmlDeclaration());
    }

}