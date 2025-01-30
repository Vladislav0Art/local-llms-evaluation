package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsNotXmlDeclarationTest {

    @Test
    public void isNotXmlDeclarationTest() {
        Comment comment = new Comment("xml");
        assertFalse(comment.isXmlDeclaration());
    }

}