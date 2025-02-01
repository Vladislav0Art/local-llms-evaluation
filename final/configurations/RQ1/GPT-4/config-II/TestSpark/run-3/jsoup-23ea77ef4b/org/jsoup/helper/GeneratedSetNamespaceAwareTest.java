package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSetNamespaceAwareTest {

    @Test
    public void setNamespaceAwareTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.namespaceAware(false);
        assertFalse(w3cDom.namespaceAware());

        w3cDom = w3cDom.namespaceAware(true);
        assertTrue(w3cDom.namespaceAware());
    }

}