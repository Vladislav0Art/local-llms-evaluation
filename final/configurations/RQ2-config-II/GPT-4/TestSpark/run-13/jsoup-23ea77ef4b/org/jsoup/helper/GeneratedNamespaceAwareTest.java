package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;

public class GeneratedNamespaceAwareTest {

    @Test
    public void NamespaceAwareTest() {
        W3CDom w3cDom = new W3CDom();
        boolean namespaceAware = w3cDom.namespaceAware();
        Assert.assertFalse(namespaceAware);
    }

}