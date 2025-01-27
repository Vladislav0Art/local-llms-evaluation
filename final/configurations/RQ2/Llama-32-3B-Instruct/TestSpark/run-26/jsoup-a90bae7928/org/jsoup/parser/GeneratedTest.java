package org.jsoup.parser;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parse_WithStringAndEmptyInput_ReturnsDefaultDocument() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse("", "https://example.com");
        assertNotNull(document);
        assertTrue(document.toString().isEmpty());
    }

    @Test
    public void process_WithEndTag_ReturnsTrue() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = Mockito.mock(Token.class);
        assertTrue(builder.process(token));
    }

    @Test
    public void parse_WithReaderAndEmptyInput_ReturnsDefaultDocument() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(new java.io.StringReader(""), "https://example.com");
        assertNotNull(document);
        assertTrue(document.toString().isEmpty());
    }

}