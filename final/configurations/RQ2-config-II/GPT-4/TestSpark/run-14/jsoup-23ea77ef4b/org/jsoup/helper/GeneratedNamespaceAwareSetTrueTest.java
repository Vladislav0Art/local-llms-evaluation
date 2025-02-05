package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.jsoup.nodes.Document;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class GeneratedNamespaceAwareSetTrueTest {

    @Test
    public void namespaceAwareSetTrueTest() {
        W3CDom w3CDom = new W3CDom().namespaceAware(true);
        Assert.assertTrue(w3CDom.namespaceAware());
    }

}