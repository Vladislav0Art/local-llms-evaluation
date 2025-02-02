package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedIsXmlDeclaration_ReturnsFalse {

    @Test
    public void isXmlDeclaration_ReturnsFalse() {
        Comment comment = new Comment("This is not an XML declaration");
        assertFalse(comment.isXmlDeclaration());
    }

}