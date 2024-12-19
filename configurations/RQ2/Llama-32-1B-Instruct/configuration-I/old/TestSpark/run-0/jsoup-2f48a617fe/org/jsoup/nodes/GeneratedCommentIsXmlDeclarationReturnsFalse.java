package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedCommentIsXmlDeclarationReturnsFalse {

    @Test
    public void commentIsXmlDeclarationReturnsFalse() {
        // Stub the DocumentOutputSettings for testing purposes
        Document.OutputSettings expected = new Document.OutputSettings();
        expected.setEncoding("UTF-8");

        Comment comment = new Comment("");
        boolean actual = comment.isXmlDeclaration();
        assertEquals(false, actual);
    }

}