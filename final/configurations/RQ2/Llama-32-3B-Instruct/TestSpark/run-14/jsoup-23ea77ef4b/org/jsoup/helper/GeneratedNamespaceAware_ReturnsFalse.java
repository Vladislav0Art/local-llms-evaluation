package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedNamespaceAware_ReturnsFalse {

    @Test
    public void namespaceAware_ReturnsFalse() {
        assertFalse(W3CDom.namespaceAware(false));
    }

}