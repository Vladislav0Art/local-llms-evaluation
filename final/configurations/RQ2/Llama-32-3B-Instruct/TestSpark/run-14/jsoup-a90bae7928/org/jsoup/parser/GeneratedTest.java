package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void testParseFragment() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String fragment = "<root><child/></root>";
        when(xmlTreeBuilder.parseFragment(any(String.class), any(Element.class), any(String.class), any(Parser.class))).thenReturn(null);

        // Act & Assert
        assertEquals(null, xmlTreeBuilder.parseFragment(fragment));
    }

    @Test
    public void testParseDocument() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String document = "<root><child/></root>";
        when(xmlTreeBuilder.parseDocument(any(String.class))).thenReturn(null);

        // Act & Assert
        assertEquals(null, xmlTreeBuilder.parseDocument(document));
    }

    @Test
    public void testParse() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String xml = "<root><child/></root>";
        when(xmlTreeBuilder.parse(any(String.class))).thenReturn(null);

        // Act & Assert
        assertEquals(null, xmlTreeBuilder.parse(xml));
    }

    public static class XmlTreeBuilder {
        public Element parseFragment(String fragment) {
            return null;
        }

        public void parseDocument(String document) {
        }

        public void parse(String xml) {
        }
    }
}

}