package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedAsXmlDeclarationShouldReturnTrue {

    @Test
    public void asXmlDeclarationShouldReturnTrue() {
        Comment comment = new Comment("This is a comment");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
        assertEquals("comment", xmlDeclaration.nodeValue);
    }

}