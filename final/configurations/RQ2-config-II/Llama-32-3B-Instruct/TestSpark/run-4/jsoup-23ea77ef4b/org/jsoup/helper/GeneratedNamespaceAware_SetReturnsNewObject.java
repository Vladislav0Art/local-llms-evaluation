package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;

public class GeneratedNamespaceAware_SetReturnsNewObject {

    @Test
    public void namespaceAware_SetReturnsNewObject() {
        W3CDom obj1 = new W3CDom();
        W3CDom obj2 = new W3CDom(obj1.namespaceAware());
        assertFalse(obj1.namespaceAware());
        assertTrue(obj2.namespaceAware());
    }

}