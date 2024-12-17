package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class GeneratedIsXmlDeclarationReturnsFalseForNonDeclaration {

    @Test
    public void isXmlDeclarationReturnsFalseForNonDeclaration() {
        Comment comment = new Comment("Some comment");
        assertFalse(comment.isXmlDeclaration());
    }

}