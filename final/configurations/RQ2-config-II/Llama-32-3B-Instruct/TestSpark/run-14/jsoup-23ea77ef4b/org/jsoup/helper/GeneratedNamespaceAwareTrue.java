package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNamespaceAwareTrue {

    @Test
    public void namespaceAwareTrue() {
        boolean result = new W3CDom().namespaceAware(true);
        assertTrue(result);
    }

}