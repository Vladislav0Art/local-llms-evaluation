package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.QuirksMode;
import org.jsoup.nodes.OutputSettings;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class GeneratedCreateShellTest {

    @Test
    public void createShellTest() {
        // Arrange
        String baseUri = "http://www.example.com";
        Document document = Mockito.mock(Document.class);

        // Act
        Document result = Document.createShell(baseUri);

        // Assert
        Mockito.verify(document).createElement("");
        assertEquals(baseUri, result.baseUri());
    }

}