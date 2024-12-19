package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclarationSetsAsXmlDeclarationForXMLDeclarations {

    @Test
    public void asXmlDeclarationSetsAsXmlDeclarationForXMLDeclarations() {
        String xmlDeclaration = "<xml declaration>";
        Comment comment = new Comment(xmlDeclaration);
        XmlDeclaration xmlDeclarationValue = comment.asXmlDeclaration();
        assertNotNull(xmlDeclarationValue);
        assertEquals(xmlDeclaration, xmlDeclarationValue.toString());
    }

}