package org.jsoup.helper;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareDefaultTest {

    @Test
    public void namespaceAwareDefaultTest() {
        W3CDom w3cDom = new W3CDom();
        assertTrue(w3cDom.namespaceAware());
    }

}