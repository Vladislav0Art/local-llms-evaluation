package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvert_ElementToDocumentIn {

    @Test
    public void convert_ElementToDocumentIn() {
        Element element = new org.jsoup.internal.JsoupInternalElement();
        Document outDoc = new org.jsoup.internal.JsoupInternalDocument();
        W3CDom.convert(element, outDoc);
        assertNotNull(outDoc);
    }

}