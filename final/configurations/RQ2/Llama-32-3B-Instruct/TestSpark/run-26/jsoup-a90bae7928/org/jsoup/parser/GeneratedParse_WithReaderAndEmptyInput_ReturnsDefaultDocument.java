package org.jsoup.parser;

import static org.junit.Assert.*;

import java.util.concurrent.Mock;

public class GeneratedParse_WithReaderAndEmptyInput_ReturnsDefaultDocument {

    @Test
    public void parse_WithReaderAndEmptyInput_ReturnsDefaultDocument() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(new StringReader(""), "https://example.com");
        assertNotNull(document);
    }

}