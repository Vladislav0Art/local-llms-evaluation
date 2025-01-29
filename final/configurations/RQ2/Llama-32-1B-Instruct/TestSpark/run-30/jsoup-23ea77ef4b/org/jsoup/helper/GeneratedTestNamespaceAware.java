package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Selector;

public class GeneratedTestNamespaceAware {

    public static String toString(W3CDom w3cdom) {
        return w3cdom.toString();
    }

    @Test
    public void testNamespaceAware() {
        W3CDom w3cdom = new W3CDom();
        boolean actual = w3cdom.namespaceAware();
        assertEquals(true, actual);
    }

}