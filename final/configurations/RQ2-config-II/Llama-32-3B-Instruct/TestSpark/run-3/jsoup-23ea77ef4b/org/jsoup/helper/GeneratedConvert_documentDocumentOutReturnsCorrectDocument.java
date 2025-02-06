package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.Map;

public class GeneratedConvert_documentDocumentOutReturnsCorrectDocument {

    @Test
    public void convert_documentDocumentOutReturnsCorrectDocument() {
        Document inDoc = Mockito.mock(Document.class);
        Document outDoc = Mockito.mock(Document.class);
        Document expected = outDoc;
        W3CDom.convert(inDoc, outDoc);
        assertEquals(expected, outDoc);
    }

}