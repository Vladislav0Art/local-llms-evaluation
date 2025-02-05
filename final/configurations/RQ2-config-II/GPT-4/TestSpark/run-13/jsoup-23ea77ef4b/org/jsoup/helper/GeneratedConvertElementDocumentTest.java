package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;

public class GeneratedConvertElementDocumentTest {

    @Test
    public void ConvertElementDocumentTest() {
        org.jsoup.nodes.Element element = Mockito.mock(org.jsoup.nodes.Element.class);
        org.w3c.dom.Document document = Mockito.mock(org.w3c.dom.Document.class);
        W3CDom w3cDom = new W3CDom();
        w3cDom.convert(element, document);
    }

}