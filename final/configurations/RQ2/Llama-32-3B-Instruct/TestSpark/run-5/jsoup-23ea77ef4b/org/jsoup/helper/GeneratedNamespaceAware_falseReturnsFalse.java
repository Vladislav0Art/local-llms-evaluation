package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedNamespaceAware_falseReturnsFalse {

    @Test
    public void namespaceAware_falseReturnsFalse() {
        assertFalse(W3CDom.namespaceAware(false));
    }

}