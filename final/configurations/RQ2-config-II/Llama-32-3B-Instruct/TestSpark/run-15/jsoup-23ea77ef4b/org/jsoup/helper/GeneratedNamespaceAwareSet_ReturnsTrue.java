package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.NodeList;
import org.w3c.dom.DocumentType;

public class GeneratedNamespaceAwareSet_ReturnsTrue {

    @Test
    public void namespaceAwareSet_ReturnsTrue() {
        assertTrue(W3CDom.namespaceAware(true));
    }

}