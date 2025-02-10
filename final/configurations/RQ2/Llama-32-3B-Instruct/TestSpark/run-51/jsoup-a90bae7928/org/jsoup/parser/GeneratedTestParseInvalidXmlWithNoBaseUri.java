package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestParseInvalidXmlWithNoBaseUri {

    @Test
    public void testParseInvalidXmlWithNoBaseUri() throws Exception {
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

public class HtmlParser {

    private StringBuilder result;

    public void parse(String xmlString) throws Exception {
        // Parsing logic here...
        result = new StringBuilder();
        // ...
    }

    public String getResult() {
        return result.toString();
    }

}