package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;

public class GeneratedAsXmlDeclaration {

    @Test
    public void asXmlDeclaration() {
        Comment comment = new Comment("<![CDATA[Comment text]]>");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
        assertEquals("Comment text", xmlDeclaration.getValue().toString());
    }

}