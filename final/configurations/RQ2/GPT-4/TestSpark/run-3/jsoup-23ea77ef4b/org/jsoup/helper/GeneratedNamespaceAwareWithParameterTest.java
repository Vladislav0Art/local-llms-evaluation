package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Properties;

public class GeneratedNamespaceAwareWithParameterTest {

    @Test
    public void namespaceAwareWithParameterTest() {
        W3CDom w3CDom = new W3CDom();
        Assert.assertTrue(w3CDom.namespaceAware(true).namespaceAware());
    }

}