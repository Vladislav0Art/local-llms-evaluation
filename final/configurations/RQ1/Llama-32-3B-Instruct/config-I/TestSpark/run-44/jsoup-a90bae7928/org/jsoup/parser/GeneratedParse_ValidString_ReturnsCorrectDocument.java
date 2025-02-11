package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedParse_ValidString_ReturnsCorrectDocument {

    @Test
    public void parse_ValidString_ReturnsCorrectDocument() {
        String input = "<xml><root>test</root></xml>";
        Document expectedDoc = Document.parse(input, "http://example.com", new Parser(XmlTreeBuilder.class)).getDocument();
        XmlTreeBuilder builder = Mockito.mock(XmlTreeBuilder.class);
        when(builder.defaultSettings()).thenReturn(ParseSettings.preserveCase);

        Document actualDoc = builder.parse(new StringReader(input), "http://example.com").getDocument();

        assertEquals(expectedDoc, actualDoc);
    }

}