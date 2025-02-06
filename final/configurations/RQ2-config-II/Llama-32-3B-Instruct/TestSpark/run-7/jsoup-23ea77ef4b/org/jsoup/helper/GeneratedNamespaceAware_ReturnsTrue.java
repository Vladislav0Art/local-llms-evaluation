package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNamespaceAware_ReturnsTrue {

    @Test
    public void namespaceAware_ReturnsTrue() {
        assertTrue(W3CDom.namespaceAware());
    }

}