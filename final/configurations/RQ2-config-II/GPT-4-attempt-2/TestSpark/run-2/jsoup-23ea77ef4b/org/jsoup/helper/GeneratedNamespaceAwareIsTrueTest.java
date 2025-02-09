package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNamespaceAwareIsTrueTest {

    @Test
    public void namespaceAwareIsTrueTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.namespaceAware(true);
        Assert.assertTrue(w3cDom.namespaceAware());
    }

}