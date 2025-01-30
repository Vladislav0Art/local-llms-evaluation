package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class GeneratedNamespaceAwareChangeTest {

    @Test
    public void namespaceAwareChangeTest() {
        W3CDom w3CDom = new W3CDom();
        w3CDom.namespaceAware(false);
        Assert.assertFalse(w3CDom.namespaceAware());
    }

}