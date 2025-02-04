package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAsXmlDeclarationReturnsNullWhenCannotBeParsedAsXmlDeclaration {

    @Test
    public void asXmlDeclarationReturnsNullWhenCannotBeParsedAsXmlDeclaration() {
        Comment comment = new Comment("Test");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNull(xmlDeclaration);
    }

}