package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedCommentAsXmlDeclarationReturnsCorrectResult {

    @Test
    public void commentAsXmlDeclarationReturnsCorrectResult() {
        // Stub the DocumentOutputSettings for testing purposes
        Document.OutputSettings expected = new Document.OutputSettings();
        expected.setEncoding("UTF-8");

        Comment comment = new Comment("");
        String result = comment.asXmlDeclaration();
        assertEquals(expected.getEncoding(), result);
    }

}