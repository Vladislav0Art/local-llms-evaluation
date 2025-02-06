package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromJsoup_DocumentFromDocument {

    @Test
    public void fromJsoup_DocumentFromDocument() {
        Document document = new org.jsoup.internal.JsoupInternalDocument();
        Document expectedDoc = new org.jsoup.internal.JsoupInternalDocument();
        Document actualDoc = W3CDom.fromJsoup(document);
        assertEquals(expectedDoc, actualDoc);
    }

}