package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedParse_InvalidString_ReturnsCorrectDocument {

    @Test
    public void parse_InvalidString_ReturnsCorrectDocument() {
        String input = "";
        Document expectedDoc = null;
        XmlTreeBuilder builder = Mockito.mock(XmlTreeBuilder.class);
        when(builder.defaultSettings()).thenReturn(ParseSettings.preserveCase);

        Document actualDoc = builder.parse(input, "http://example.com").getDocument();

        assertEquals(expectedDoc, actualDoc);
    }

}