package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Selector;

public class GeneratedTestNamespaceAwareWithBoolean {

    public static String toString(W3CDom w3cdom) {
        return w3cdom.toString();
    }

    @Test
    public void testNamespaceAwareWithBoolean() {
        W3CDom w3cdom = new W3CDom();
        int expected = 1;
        int actual = w3cdom.namespaceAware(2);
        assertEquals(expected, actual);
    }

}