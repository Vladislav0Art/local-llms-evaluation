package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSelectXpath_XPathStringFromContext {

    @Test
    public void selectXpath_XPathStringFromContext() {
        Document document = new org.jsoup.internal.JsoupInternalDocument();
        Element contextElement = new org.jsoup.internal.JsoupInternalElement();
        NodeList expectedNodeList = new org.jsoup.internal.JsoupInternalNodeList();
        NodeList actualNodeList = W3CDom.selectXpath("xpath", contextElement);
        assertEquals(expectedNodeList, actualNodeList);
    }

}