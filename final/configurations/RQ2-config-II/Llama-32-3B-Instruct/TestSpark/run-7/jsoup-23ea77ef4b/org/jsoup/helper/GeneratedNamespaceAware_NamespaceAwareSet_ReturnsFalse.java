package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNamespaceAware_NamespaceAwareSet_ReturnsFalse {

    @Test
    public void namespaceAware_NamespaceAwareSet_ReturnsFalse() {
        assertFalse(W3CDom.namespaceAware(false));
    }

}