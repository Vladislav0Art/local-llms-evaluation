package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedNamespaceAwareDataTest {

    @Test
    public void namespaceAwareDataTest() {
        W3CDom w3cDom = new W3CDom();
        boolean initialNamespaceAware = w3cDom.namespaceAware();
        w3cDom.namespaceAware(!initialNamespaceAware);
        assertEquals(!initialNamespaceAware, w3cDom.namespaceAware());
    }

}