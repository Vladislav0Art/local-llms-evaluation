package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Attribute;
import org.jsoup.select.NodeVisitor;
import org.jsoup.helper.W3CDom;

public class GeneratedNamespaceAware_SetsNamespaceAwareFlag {

    @Test
    public void namespaceAware_SetsNamespaceAwareFlag() {
        boolean namespaceAware = false;
        W3CDom w3cdom = new W3CDom();
        w3cdom.namespaceAware(namespaceAware);
        assertTrue(namespaceAware);
    }

}