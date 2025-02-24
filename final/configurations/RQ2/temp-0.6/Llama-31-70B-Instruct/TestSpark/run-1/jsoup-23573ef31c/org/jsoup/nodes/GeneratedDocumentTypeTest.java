package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.OutputSettings;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.select.Selector;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDocumentTypeTest {

    @Mock
    private Document document;

    @Before
    public void setUp() {
        document = new Document("https://www.google.com");
    }

    @Test
    public void documentTypeTest() {
        DocumentType documentType = mock(DocumentType.class);
        when(document.documentType()).thenReturn(documentType);
        assertEquals(documentType, document.documentType());
    }

}