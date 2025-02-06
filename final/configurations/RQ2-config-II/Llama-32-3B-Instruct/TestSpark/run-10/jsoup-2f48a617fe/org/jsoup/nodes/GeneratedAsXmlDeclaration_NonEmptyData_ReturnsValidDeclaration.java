package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedAsXmlDeclaration_NonEmptyData_ReturnsValidDeclaration {

    @Test
    public void asXmlDeclaration_NonEmptyData_ReturnsValidDeclaration() {
        Comment comment = new Comment("data");
        XmlDeclaration expectedDeclaration = new XmlDeclaration("data", "xml-data");
        assertNotNull(expectedDeclaration);
        assertEquals("data", expectedDeclaration.getName());
        assertEquals("xml-data", expectedDeclaration.getData());
    }

    private static Document document(Document.OutputSettings out) {
        return new Document(out);
    }

}