package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.nio.charset.Charset;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParserTest {

    @Mock
    private Connection mockConnection;

    @Mock
    private Parser mockParser;

    @Test
    public void parserTest() {
        Document document = new Document("http://baseUri.com");
        document.parser(mockParser);
        assertEquals(mockParser, document.parser());
    }

}