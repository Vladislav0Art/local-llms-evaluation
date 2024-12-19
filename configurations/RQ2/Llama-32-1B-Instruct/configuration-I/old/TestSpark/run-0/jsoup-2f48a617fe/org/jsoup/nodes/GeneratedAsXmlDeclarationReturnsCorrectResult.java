package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;

public class GeneratedAsXmlDeclarationReturnsCorrectResult {

    @Test
    public void asXmlDeclarationReturnsCorrectResult() {
        // Stub the DocumentOutputSettings for testing purposes
        String[] expected = {"<root><comment>test</comment></root>", "<root><comment>expected <attribute>value</attribute></root>"};

        Comment comment = new Comment("");
        Object result = comment.asXmlDeclaration();
        assertEquals(expected[0], (String) result);
    }

}