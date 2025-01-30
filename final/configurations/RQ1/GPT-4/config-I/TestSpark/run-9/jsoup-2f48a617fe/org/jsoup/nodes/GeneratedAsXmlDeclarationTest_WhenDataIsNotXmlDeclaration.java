package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedAsXmlDeclarationTest_WhenDataIsNotXmlDeclaration {

    @Test
    public void asXmlDeclarationTest_WhenDataIsNotXmlDeclaration() {
        Comment comment = new Comment("This is not an XML Declaration");
        assertNull(comment.asXmlDeclaration());
    }

}