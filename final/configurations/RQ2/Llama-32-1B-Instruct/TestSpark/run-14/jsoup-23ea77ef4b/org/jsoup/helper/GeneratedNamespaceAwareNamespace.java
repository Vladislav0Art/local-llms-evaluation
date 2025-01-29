package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedNamespaceAwareNamespace {

    @Test
    public void namespaceAwareNamespace() {
        W3CDom w3cdom = new W3CDom();
        assertEquals(true, w3cdom.namespaceAware(true));
        assertEquals(false, w3cdom.namespaceAware(false));
    }

}