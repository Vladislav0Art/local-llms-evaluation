package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestParseValidXmlWithNoBaseUri {

    @Test
    public void testParseValidXmlWithNoBaseUri() throws Exception {
        // Arrange
        String xmlString = "<xml><tag>value</tag></xml>";

        // Act
        HtmlParser parser = new HtmlParser();
        parser.parse(xmlString);
        String result = parser.getResult();

        // Assert
        assertEquals("value", result);
    }

}