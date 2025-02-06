package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.NodeList;
import org.w3c.dom.DocumentType;

public class GeneratedNamespaceAwareDefault_ReturnsFalse {

    @Test
    public void namespaceAwareDefault_ReturnsFalse() {
        assertFalse(W3CDom.namespaceAware());
    }

}