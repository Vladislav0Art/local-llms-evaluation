package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvert_DocumentToDocument {

    @Test
    public void convert_DocumentToDocument() {
        Document document = new org.jsoup.internal.JsoupInternalDocument();
        Document expectedDoc = new org.jsoup.internal.JsoupInternalDocument();
        Document actualDoc = W3CDom.convert(document);
        assertEquals(expectedDoc, actualDoc);
    }

}