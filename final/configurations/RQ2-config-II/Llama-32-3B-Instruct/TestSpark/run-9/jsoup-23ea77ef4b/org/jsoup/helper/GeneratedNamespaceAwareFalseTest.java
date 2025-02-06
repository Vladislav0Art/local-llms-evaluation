package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

public class GeneratedNamespaceAwareFalseTest {

    @Test
    public void namespaceAwareFalseTest() {
        boolean result = new W3CDom().namespaceAware(false);
        assertFalse(result);
    }

}