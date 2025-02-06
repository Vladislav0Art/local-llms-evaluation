package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;

public class GeneratedNamespaceAware_ReturnsTrue {

    @Test
    public void namespaceAware_ReturnsTrue() {
        boolean result = new W3CDom().namespaceAware();
        assertTrue(result);
    }

}