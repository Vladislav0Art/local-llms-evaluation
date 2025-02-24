package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    @Test
    public void setDocumentTypeTest() {
        Document doc = new Document("baseuri");
        DocumentType documentType = mock(DocumentType.class);
        doc.documentType(documentType);
    }

    @Test
    public void getDocumentTypeTest() {
        Document doc = new Document("baseuri");
        DocumentType documentType = mock(DocumentType.class);
        doc.documentType(documentType);
        DocumentType actual = doc.documentType();
        assertEquals(documentType, actual);
    }

    @Test
    public void getHeadTest() {
        Document doc = new Document("baseuri");
        Element head = mock(Element.class);
        when(head.tagName()).thenReturn("head");
        doc.appendChild(head);
        Element actual = doc.head();
        assertEquals(head, actual);
    }

    @Test
    public void getBodyTest() {
        Document doc = new Document("baseuri");
        Element body = mock(Element.class);
        when(body.tagName()).thenReturn("body");
        doc.appendChild(body);
        Element actual = doc.body();
        assertEquals(body, actual);
    }

}