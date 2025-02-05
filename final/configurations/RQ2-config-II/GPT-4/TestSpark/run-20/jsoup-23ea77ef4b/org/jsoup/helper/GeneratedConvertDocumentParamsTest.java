package org.jsoup.helper;

import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedConvertDocumentParamsTest {

    @Test
    public void convertDocumentParamsTest() {
        W3CDom w3CDom = new W3CDom();
        org.jsoup.nodes.Document in = mock(org.jsoup.nodes.Document.class);
        Document out = mock(Document.class);
        w3CDom.convert(in, out);
        assertTrue(true);
    }

}