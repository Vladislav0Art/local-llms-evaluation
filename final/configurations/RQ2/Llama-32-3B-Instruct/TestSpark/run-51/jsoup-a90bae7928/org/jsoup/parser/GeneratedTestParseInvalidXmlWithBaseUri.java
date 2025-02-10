package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestParseInvalidXmlWithBaseUri {

    @Test
    public void testParseInvalidXmlWithBaseUri() throws Exception {
        // Arrange
        String xmlString = "<xml><tag>value</tag>";

        // Act
        HtmlParser parser = new HtmlParser();
        parser.parse(xmlString);
        String result = parser.getResult();

        // Assert
        assertEquals("Error: Invalid XML", result);
    }

}