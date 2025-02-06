package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvert_DocumentToDocumentIn {

    @Test
    public void convert_DocumentToDocumentIn() {
        Document document = new org.jsoup.internal.JsoupInternalDocument();
        Document outDoc = new org.jsoup.internal.JsoupInternalDocument();
        W3CDom.convert(document, outDoc);
        assertNotNull(outDoc);
    }

}