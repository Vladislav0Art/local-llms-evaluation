package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;

public class GeneratedNamespaceAwareBooleanTest {

    @Test
    public void NamespaceAwareBooleanTest() {
        W3CDom w3cDom = new W3CDom();
        Assert.assertNotNull(w3cDom.namespaceAware(true));
    }

}