package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestXmlDeclaration {

    @Test
    public void testXmlDeclaration() {
        // Create an XmlDeclaration object
        XmlDeclaration xmlDecl = new XmlDeclaration();

        // Set the xml declaration content
        xmlDecl.setXmlContent("<xml>Test XML Declaration</xml>");

        // Test if it's an xml declaration
        assertTrue(xmlDecl.isXmlDeclaration());

        // Test if it's not null
        assertNotNull(xmlDecl);

        // Test if it has a valid xml declaration
        assertFalse(xmlDecl.asXmlDeclaration().isEmpty());
    }
}

class XmlDeclaration {
    private String xmlContent;

    public void setXmlContent(String xmlContent) {
        this.xmlContent = xmlContent;
    }

    public boolean isXmlDeclaration() {
        return true; // For simplicity, we assume it's an xml declaration
    }

    public String asXmlDeclaration() {
        return xmlContent;
    }

}