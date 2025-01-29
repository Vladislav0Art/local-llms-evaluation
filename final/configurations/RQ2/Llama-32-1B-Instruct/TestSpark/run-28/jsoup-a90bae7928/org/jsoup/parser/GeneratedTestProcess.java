package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestProcess {

    private Document expectedDocument = new Document();

    @Test
    public void testProcess() {
        // Arrange
        String baseUri = "";
        ParseSettings defaultSettings = new ParseSettings();
        Parser parser = new DefaultParser();

        // Act
        XmlTreeBuilder builder = new XmlTreeBuilder();
        boolean result = builder.process(new Token());

        // Assert
        assertEquals(false, result);
    }

}