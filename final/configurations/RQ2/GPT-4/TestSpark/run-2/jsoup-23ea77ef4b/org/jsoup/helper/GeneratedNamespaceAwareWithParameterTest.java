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

public class GeneratedNamespaceAwareWithParameterTest {

    private W3CDom w3CDom = new W3CDom();

    @Test
    public void namespaceAwareWithParameterTest() {
        w3CDom.namespaceAware(true);
        boolean testValue = w3CDom.namespaceAware();
        Assert.assertTrue("Expected value to be true", testValue);
    }

}