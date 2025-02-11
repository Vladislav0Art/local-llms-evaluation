package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedInitialiseParse_ValidReader_ReturnsCorrectDocument {

    @Test
    public void initialiseParse_ValidReader_ReturnsCorrectDocument() {
        String input = "<xml><root>test</root></xml>";
        Reader reader = new StringReader(input);
        Document expectedDoc = Document.parse(reader, "http://example.com", null).getDocument();
        XmlTreeBuilder builder = Mockito.mock(XmlTreeBuilder.class);
        when(builder.defaultSettings()).thenReturn(ParseSettings.preserveCase);

        Document actualDoc = builder.initialiseParse(reader, "http://example.com", new Parser(builder)).getDocument();

        assertEquals(expectedDoc, actualDoc);
    }

}