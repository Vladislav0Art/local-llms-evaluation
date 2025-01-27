package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareFalse {

    @Test
    public void namespaceAwareFalse() {
        boolean result = new W3CDom().namespaceAware(false);
        assertTrue(result);
    }

}