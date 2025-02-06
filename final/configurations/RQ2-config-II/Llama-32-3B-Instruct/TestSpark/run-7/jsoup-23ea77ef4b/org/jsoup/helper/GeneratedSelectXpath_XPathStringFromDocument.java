package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSelectXpath_XPathStringFromDocument {

    @Test
    public void selectXpath_XPathStringFromDocument() {
        Document document = new org.jsoup.internal.JsoupInternalDocument();
        NodeList expectedNodeList = new org.jsoup.internal.JsoupInternalNodeList();
        NodeList actualNodeList = W3CDom.selectXpath("xpath", document);
        assertEquals(expectedNodeList, actualNodeList);
    }

}