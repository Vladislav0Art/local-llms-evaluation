package org.jsoup.helper;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Document;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedConvertDocumentTest {

    @Test
    public void convertDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        Document document = new Document();
        Document wDocument = Mockito.mock(Document.class);
        w3cDom.convert(document, wDocument);
        Mockito.verify(wDocument, Mockito.times(1)).appendChild(Mockito.any());
    }

}