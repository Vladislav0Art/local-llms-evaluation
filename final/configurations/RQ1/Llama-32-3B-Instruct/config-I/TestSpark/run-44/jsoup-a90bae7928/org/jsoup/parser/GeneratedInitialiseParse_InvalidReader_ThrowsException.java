package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedInitialiseParse_InvalidReader_ThrowsException {

    @Test
    public void initialiseParse_InvalidReader_ThrowsException() {
        Reader reader = null;
        XmlTreeBuilder builder = Mockito.mock(XmlTreeBuilder.class);
        when(builder.defaultSettings()).thenReturn(ParseSettings.preserveCase);

        try {
            builder.initialiseParse(reader, "http://example.com", new Parser(builder));
            fail("Expected exception not thrown");
        } catch (NullPointerException e) {
            // expected
        }
    }

}