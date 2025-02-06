package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.Document;
import org.mockito.Mockito;

public class GeneratedParserUpdatesParser {

    @Test
    public void parserUpdatesParser() {
        Parser parser = Mockito.mock(Parser.class);
        Document document = Document.createShell("http://example.com");
        document.parser(parser);
        assertEquals(parser, document.parser());
    }

}