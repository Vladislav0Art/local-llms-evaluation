package org.jsoup.helper;

import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedNamespaceAwareParamTest {

    @Test
    public void namespaceAwareParamTest() {
        W3CDom w3CDom = new W3CDom();
        assertTrue(w3CDom.namespaceAware(true).namespaceAware());
    }

}