package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

public class GeneratedConvert_FromJsoupDocumentToW3CDocument {

    @Test
    public void convert_FromJsoupDocumentToW3CDocument() {
        Document soupDoc = new Document();
        Document w3cDoc = W3CDom.convert(soupDoc);
        assertNotNull(w3cDoc);
    }

}