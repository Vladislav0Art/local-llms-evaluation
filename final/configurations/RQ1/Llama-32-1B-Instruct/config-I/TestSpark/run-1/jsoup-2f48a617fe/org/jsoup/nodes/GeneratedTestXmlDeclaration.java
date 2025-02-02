package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestXmlDeclaration {

    @Test
    public void testXmlDeclaration() {
        Comment comment = new Comment("#This is an XML Declaration");
        assertTrue(comment.isXmlDeclaration());
    }

}