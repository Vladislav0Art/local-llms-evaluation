package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

public class GeneratedFromJsoupDocument_WillConvertToW3CDocument {

    @Test
    public void fromJsoupDocument_WillConvertToW3CDocument() {
        Document soupDoc = new Document();
        Document w3cDoc = W3CDom.fromJsoup(soupDoc);
        assertNotNull(w3cDoc);
    }

}