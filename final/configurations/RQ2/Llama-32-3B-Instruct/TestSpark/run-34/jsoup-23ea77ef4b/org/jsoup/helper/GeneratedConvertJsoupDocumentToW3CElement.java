package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

public class GeneratedConvertJsoupDocumentToW3CElement {

    @Test
    public void convertJsoupDocumentToW3CElement() {
        Document soupDoc = new Document();
        soupDoc.appendText("Hello World!");
        Element w3cEl = new Element();
        W3CDom.convert(soupDoc, w3cEl);
        assertNotNull(w3cEl);
    }

}