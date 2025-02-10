package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestIsXmlDeclaration {

    @Test
    public void testIsXmlDeclaration() {
        Comment comment = new Comment("<!-- This is an XML declaration -->");
        boolean result = comment.isXmlDeclaration();
        assertTrue(result);
    }

}