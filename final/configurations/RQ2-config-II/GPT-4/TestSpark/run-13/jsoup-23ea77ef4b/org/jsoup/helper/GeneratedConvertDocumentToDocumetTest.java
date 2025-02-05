package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;

public class GeneratedConvertDocumentToDocumetTest {

    @Test
    public void ConvertDocumentToDocumetTest() {
        Document doc = Mockito.mock(Document.class);
        org.w3c.dom.Document outDocument = Mockito.mock(org.w3c.dom.Document.class);
        W3CDom w3cDom = new W3CDom();
        w3cDom.convert(doc, outDocument);
    }

}