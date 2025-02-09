package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNamespaceAwareBooleanTest {

    @Test
    public void namespaceAwareBooleanTest() {
        W3CDom dom = new W3CDom();
        W3CDom domWithNamespace = dom.namespaceAware(true);
        Assert.assertNotNull(domWithNamespace);
        Assert.assertTrue(domWithNamespace.namespaceAware());
    }

}