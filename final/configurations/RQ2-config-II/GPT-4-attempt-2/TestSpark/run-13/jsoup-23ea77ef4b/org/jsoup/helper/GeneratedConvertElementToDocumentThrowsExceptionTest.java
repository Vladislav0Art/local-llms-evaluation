package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertElementToDocumentThrowsExceptionTest {

    @Test
    public void convertElementToDocumentThrowsExceptionTest() {
        W3CDom testInstance = new W3CDom();
        org.jsoup.nodes.Element elementIn = null;
        org.w3c.dom.Document docOut = null;
        testInstance.convert(elementIn, docOut);
    }

}