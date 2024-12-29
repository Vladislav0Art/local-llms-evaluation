package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class GeneratedFromJsoupDocumentTest_returnsCorrectDocument {

    @Test
    public void fromJsoupDocumentTest_returnsCorrectDocument() {
        Document jsoupDoc = new org.jsoup.nodes.Document();
        Document result = W3CDom.fromJsoupDocument(jsoupDoc);
        assertEquals(1, result.text().length());
    }

}