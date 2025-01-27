package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareDefault {

    @Test
    public void namespaceAwareDefault() {
        assertTrue(W3CDom.namespaceAware());
    }

}