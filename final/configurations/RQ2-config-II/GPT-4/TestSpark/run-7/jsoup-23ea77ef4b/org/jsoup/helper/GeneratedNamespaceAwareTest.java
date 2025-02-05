package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3CDom = new W3CDom();
        assertFalse(w3CDom.namespaceAware());
        w3CDom.namespaceAware(true);
        assertTrue(w3CDom.namespaceAware());
    }

}