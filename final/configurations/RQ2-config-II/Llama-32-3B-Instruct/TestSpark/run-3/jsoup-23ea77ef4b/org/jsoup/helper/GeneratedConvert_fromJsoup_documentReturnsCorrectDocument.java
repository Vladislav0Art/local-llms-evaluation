package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.Map;

public class GeneratedConvert_fromJsoup_documentReturnsCorrectDocument {

    @Test
    public void convert_fromJsoup_documentReturnsCorrectDocument() {
        org.jsoup.nodes.Document soupDoc = Mockito.mock(org.jsoup.nodes.Document.class);
        Document expected = Mockito.mock(Document.class);
        Document result = W3CDom.convert(soupDoc);
        assertEquals(expected, result);
    }

}