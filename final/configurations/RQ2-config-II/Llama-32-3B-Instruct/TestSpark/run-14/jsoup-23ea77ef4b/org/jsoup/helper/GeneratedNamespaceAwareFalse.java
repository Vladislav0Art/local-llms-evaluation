package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNamespaceAwareFalse {

    @Test
    public void namespaceAwareFalse() {
        boolean result = new W3CDom().namespaceAware(false);
        assertTrue(result);
    }

}