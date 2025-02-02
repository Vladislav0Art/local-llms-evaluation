package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedAsXmlDeclaration_ReturnsNullForInvalidData {

    @Test
    public void asXmlDeclaration_ReturnsNullForInvalidData() {
        Comment comment = new Comment("!");
        assertNotNull(comment.asXmlDeclaration());
    }

}