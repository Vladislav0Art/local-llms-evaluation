package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvertFromJsoupDocumentTest {

    @Test
    public void convertFromJsoupDocumentTest() {
        Document soupDoc = new Document();
        Document wDoc = W3CDom.convert(soupDoc);
        assertNotNull(wDoc);
    }

}