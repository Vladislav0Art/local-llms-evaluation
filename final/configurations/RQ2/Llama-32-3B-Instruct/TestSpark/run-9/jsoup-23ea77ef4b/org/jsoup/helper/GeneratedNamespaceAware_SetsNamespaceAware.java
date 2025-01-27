package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedNamespaceAware_SetsNamespaceAware {

    @Test
    public void namespaceAware_SetsNamespaceAware() {
        boolean namespaceAware = false;
        W3CDom w3cdom = new W3CDom();
        w3cdom.namespaceAware(namespaceAware);
        assertEquals(namespaceAware, w3cdom.namespaceAware());
    }

}