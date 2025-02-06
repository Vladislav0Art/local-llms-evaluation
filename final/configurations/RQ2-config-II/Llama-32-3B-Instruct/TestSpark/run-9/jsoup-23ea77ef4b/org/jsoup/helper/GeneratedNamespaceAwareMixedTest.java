package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

public class GeneratedNamespaceAwareMixedTest {

    @Test
    public void namespaceAwareMixedTest() {
        boolean result = new W3CDom().namespaceAware(true, false);
        assertFalse(result);
    }

}