package org.jsoup.parser;

import static org.junit.Assert.*;

import java.util.concurrent.Mock;

public class GeneratedParse_WithStringAndEmptyInput_ReturnsDefaultDocument {

    @Test
    public void parse_WithStringAndEmptyInput_ReturnsDefaultDocument() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse("", "https://example.com");
        assertNotNull(document);
    }

}