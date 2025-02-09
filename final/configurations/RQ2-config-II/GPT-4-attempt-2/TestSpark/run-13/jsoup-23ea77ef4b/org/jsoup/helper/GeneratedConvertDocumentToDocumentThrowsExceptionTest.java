package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertDocumentToDocumentThrowsExceptionTest {

    @Test
    public void convertDocumentToDocumentThrowsExceptionTest() {
        W3CDom testInstance = new W3CDom();
        org.jsoup.nodes.Document docIn = null;
        org.w3c.dom.Document docOut = null;
        testInstance.convert(docIn, docOut);
    }

}