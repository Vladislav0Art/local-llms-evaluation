package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class GeneratedAsXmlDeclarationReturnsNullForNonDeclaration {

    @Test
    public void asXmlDeclarationReturnsNullForNonDeclaration() {
        Comment comment = new Comment("Some comment");
        assertNull(comment.asXmlDeclaration());
    }

}