package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertNull;

public class GeneratedAsXmlDeclarationForCommentWithXmlDeclarationData_ReturnsNull {

    @Test
    public void asXmlDeclarationForCommentWithXmlDeclarationData_ReturnsNull() {
        when(comment.isXmlDeclaration()).thenReturn(true);
        XmlDeclaration xmlDeclaration = new XmlDeclaration();
        Comment comment = new Comment("some data");
        xmlDeclaration = (XmlDeclaration) comment.asXmlDeclaration();
        assertNull(xmlDeclaration);
    }

}