package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedNamespaceAwareSetTrueTest {

    @Test
    public void namespaceAwareSetTrueTest() {
        W3CDom dom = new W3CDom().namespaceAware(true);
        assertTrue(dom.namespaceAware());
    }

}