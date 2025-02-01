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

public class GeneratedDocumentConnectionTest {

    @Test
    public void DocumentConnectionTest() {
        Document doc = new Document("http://example.com");
        Connection connectionMock = Mockito.mock(Connection.class);
        doc.connection(connectionMock);
        assertEquals(connectionMock, doc.connection());
    }

}