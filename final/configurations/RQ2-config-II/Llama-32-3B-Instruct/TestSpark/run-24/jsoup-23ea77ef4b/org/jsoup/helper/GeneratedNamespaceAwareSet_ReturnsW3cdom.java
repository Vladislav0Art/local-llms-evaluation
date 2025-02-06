package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

import java.util.HashMap;
import java.util.List;

public class GeneratedNamespaceAwareSet_ReturnsW3cdom {

    @Test
    public void namespaceAwareSet_ReturnsW3cdom() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.namespaceAware(true);
        assertNotNull(w3cdom);
    }

}