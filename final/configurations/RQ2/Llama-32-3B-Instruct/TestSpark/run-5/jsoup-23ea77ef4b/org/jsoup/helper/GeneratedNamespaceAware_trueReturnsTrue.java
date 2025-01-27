package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedNamespaceAware_trueReturnsTrue {

    @Test
    public void namespaceAware_trueReturnsTrue() {
        assertTrue(W3CDom.namespaceAware());
    }

}