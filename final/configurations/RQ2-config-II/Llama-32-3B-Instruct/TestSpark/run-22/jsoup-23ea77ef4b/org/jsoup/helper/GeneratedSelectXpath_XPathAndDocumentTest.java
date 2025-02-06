package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import java.util.HashMap;

public class GeneratedSelectXpath_XPathAndDocumentTest {

    @Test
    public void selectXpath_XPathAndDocumentTest() {
        String xpath = "/*";
        Document doc = new Document();
        NodeList result = W3CDom.selectXpath(xpath, doc);
        assertNotNull(result);
    }

}