package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedContextNodeDocumentTest {

    @Test
    public void contextNodeDocumentTest() {
        Document wDoc = org.jsoup.Jsoup.parse("<html><body>Hello World!</body></html>");
        Node contextNode = W3CDom.contextNode(wDoc);
        assertNotNull(contextNode);
    }

}