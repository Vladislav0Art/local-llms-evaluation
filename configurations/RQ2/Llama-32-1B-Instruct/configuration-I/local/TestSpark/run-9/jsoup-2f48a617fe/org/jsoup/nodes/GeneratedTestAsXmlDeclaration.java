package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.jupiter.api.Test;

public class GeneratedTestAsXmlDeclaration {

    @Test
    public void testAsXmlDeclaration() {
        String expectedOutput = "<!-- This is a sample comment -->";
        Comment comment = new Comment("This is a sample comment");
        Object result = comment.asXmlDeclaration();
        if (result instanceof XmlDeclaration) {
            assertEquals(expectedOutput, ((XmlDeclaration) result).getValue());
        } else {
            fail("Unexpected result type");
        }
    }

}