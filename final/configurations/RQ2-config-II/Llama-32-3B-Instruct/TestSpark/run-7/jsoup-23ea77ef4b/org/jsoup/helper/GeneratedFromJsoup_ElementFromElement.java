package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromJsoup_ElementFromElement {

    @Test
    public void fromJsoup_ElementFromElement() {
        Element element = new org.jsoup.internal.JsoupInternalElement();
        Document expectedDoc = new org.jsoup.internal.JsoupInternalDocument();
        Document actualDoc = W3CDom.fromJsoup(element);
        assertEquals(expectedDoc, actualDoc);
    }

}