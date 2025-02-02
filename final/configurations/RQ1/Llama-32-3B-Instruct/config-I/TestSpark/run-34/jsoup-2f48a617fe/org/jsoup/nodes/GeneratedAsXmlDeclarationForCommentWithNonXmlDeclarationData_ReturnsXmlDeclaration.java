package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertNull;

public class GeneratedAsXmlDeclarationForCommentWithNonXmlDeclarationData_ReturnsXmlDeclaration {

    @Test
    public void asXmlDeclarationForCommentWithNonXmlDeclarationData_ReturnsXmlDeclaration() {
        String data = "<tag>value</tag>";
        when(comment.getData()).thenReturn(data);
        XmlDeclaration xmlDeclaration = new XmlDeclaration();
        Comment comment = new Comment(data);
        xmlDeclaration = (XmlDeclaration) comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
    }

}