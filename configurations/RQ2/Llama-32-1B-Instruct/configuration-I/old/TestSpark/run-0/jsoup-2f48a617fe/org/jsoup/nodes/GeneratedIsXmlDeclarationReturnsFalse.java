package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;

public class GeneratedIsXmlDeclarationReturnsFalse {

    @Test
    public void isXmlDeclarationReturnsFalse() {
        // Stub the DocumentOutputSettings for testing purposes
        String[] expected = {"<root><comment>test</comment></root>", "<root><comment>expected <attribute>value</attribute></root>"};

        Comment comment = new Comment("");
        boolean actual = comment.isXmlDeclaration();
        assertEquals(false, actual);
    }

}