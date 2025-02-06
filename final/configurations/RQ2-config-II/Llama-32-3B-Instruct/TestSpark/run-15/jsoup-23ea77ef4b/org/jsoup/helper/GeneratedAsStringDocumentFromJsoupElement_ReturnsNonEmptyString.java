package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.NodeList;
import org.w3c.dom.DocumentType;

public class GeneratedAsStringDocumentFromJsoupElement_ReturnsNonEmptyString {

    @Test
    public void asStringDocumentFromJsoupElement_ReturnsNonEmptyString() {
        Element in = new Element();
        assertEquals("element text", W3CDom.asString(in));
    }

}