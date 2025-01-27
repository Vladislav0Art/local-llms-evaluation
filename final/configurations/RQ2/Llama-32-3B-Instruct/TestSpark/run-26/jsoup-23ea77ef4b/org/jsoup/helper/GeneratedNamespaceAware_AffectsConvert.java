package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.select.NodeTraversor;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedNamespaceAware_AffectsConvert {

    @Test
    public void namespaceAware_AffectsConvert() {
        W3CDom w3c = new W3CDom();
        boolean result = w3c.namespaceAware();
        assertTrue(result);
    }

}