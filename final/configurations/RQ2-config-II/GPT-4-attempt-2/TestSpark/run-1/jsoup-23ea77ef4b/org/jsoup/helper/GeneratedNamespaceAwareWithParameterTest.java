package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class GeneratedNamespaceAwareWithParameterTest {

    @Test
    public void namespaceAwareWithParameterTest() {
        W3CDom w3cDom = new W3CDom().namespaceAware(true);
        Assert.assertTrue(w3cDom.namespaceAware());
    }

}