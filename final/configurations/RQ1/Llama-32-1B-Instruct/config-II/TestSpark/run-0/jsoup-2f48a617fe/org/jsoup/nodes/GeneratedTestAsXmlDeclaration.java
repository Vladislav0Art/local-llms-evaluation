package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestAsXmlDeclaration {

    @Test
    public void testAsXmlDeclaration() {
        Comment comment = new Comment("<!-- This is a comment -->");
        XmlDeclaration asXmlDecl = comment.asXmlDeclaration();
        assertNotNull(asXmlDecl);
    }

}