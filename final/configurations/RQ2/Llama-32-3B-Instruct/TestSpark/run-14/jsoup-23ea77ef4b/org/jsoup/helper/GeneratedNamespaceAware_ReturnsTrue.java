package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedNamespaceAware_ReturnsTrue {

    @Test
    public void namespaceAware_ReturnsTrue() {
        assertTrue(W3CDom.namespaceAware());
    }

}