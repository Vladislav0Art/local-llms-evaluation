package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.HashMap;

public class GeneratedNamespaceAwareBooleanTest {

    @Test
    public void namespaceAwareBooleanTest() {
        W3CDom w3CDom = new W3CDom();
        Assert.assertTrue(w3CDom.namespaceAware(true).namespaceAware());
    }

}