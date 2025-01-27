package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareSet {

    @Test
    public void namespaceAwareSet() {
        boolean result = W3CDom.namespaceAware(true);
        assertTrue(result);
    }

}