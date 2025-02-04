package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAsXmlDeclarationParsesDataWhenItIsAnXmlDeclaration {

    @Test
    public void asXmlDeclarationParsesDataWhenItIsAnXmlDeclaration() {
        Comment comment = new Comment("<?xml version=\"1.0\"?><test></test>");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
    }

}