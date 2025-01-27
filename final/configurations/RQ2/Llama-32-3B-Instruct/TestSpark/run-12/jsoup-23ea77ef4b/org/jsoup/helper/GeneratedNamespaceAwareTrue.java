package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareTrue {

    @Test
    public void namespaceAwareTrue() {
        boolean result = new W3CDom().namespaceAware(true);
        assertTrue(result);
    }

}