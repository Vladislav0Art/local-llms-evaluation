package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedNamespaceAware {

    public static Document fromJsoup(String html) {
        return neworg.jsoup.helper.W3CDom.Converter.fromJsoup(html);
    }

    @Test
    public void namespaceAware() {
        W3CDom w3cdom = new W3CDom();
        assertTrue(w3cdom.namespaceAware(true));
        assertFalse(w3cdom.namespaceAware(false));
    }

}