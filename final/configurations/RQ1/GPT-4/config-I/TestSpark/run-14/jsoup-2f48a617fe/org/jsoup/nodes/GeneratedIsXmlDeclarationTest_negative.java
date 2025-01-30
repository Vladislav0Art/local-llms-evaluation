package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclarationTest_negative {

    @Test
    public void IsXmlDeclarationTest_negative() {
        Comment comment = new Comment("Not an XML");
        assertFalse(comment.isXmlDeclaration());
    }

}