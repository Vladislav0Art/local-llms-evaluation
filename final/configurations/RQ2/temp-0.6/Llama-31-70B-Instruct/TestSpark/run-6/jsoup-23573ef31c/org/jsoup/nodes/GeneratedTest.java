package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.OutputSettings;
import org.jsoup.nodes.QuirksMode;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void createShellTest() {
        Document document = Document.createShell("Base");
        assertEquals("Base", document.location());
    }

    @Test
    public void locationTest() {
        Document document = new Document("Base");
        assertEquals("Base", document.location());
    }

    @Test
    public void connectionTest() {
        Document document = new Document("Base");
        Connection connection = Mockito.mock(Connection.class);
        document.connection(connection);
        assertSame(connection, document.connection());
    }

    @Test
    public void documentTypeTest() {
        Document document = new Document("Base");
        DocumentType documentType = Mockito.mock(DocumentType.class);
        document.documentType(documentType);
        assertSame(documentType, document.documentType());
    }

}