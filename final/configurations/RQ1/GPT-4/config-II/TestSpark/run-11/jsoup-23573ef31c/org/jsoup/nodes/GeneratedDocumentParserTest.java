package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedDocumentParserTest {

    @Test
    public void DocumentParserTest() {
        Document doc = new Document("http://example.com");
        Parser parserMock = Mockito.mock(Parser.class);
        doc.parser(parserMock);
        assertEquals(parserMock, doc.parser());
    }

}