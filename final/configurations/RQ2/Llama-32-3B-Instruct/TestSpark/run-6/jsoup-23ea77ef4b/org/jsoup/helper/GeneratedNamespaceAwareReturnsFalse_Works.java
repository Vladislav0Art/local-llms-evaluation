package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedNamespaceAwareReturnsFalse_Works {

    @Test
    public void namespaceAwareReturnsFalse_Works() {
        W3CDom w3cd = new W3CDom();
        assertFalse(w3cd.namespaceAware());
    }

}