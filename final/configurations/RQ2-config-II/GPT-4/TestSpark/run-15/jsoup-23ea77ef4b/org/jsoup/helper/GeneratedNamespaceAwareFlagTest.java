package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class GeneratedNamespaceAwareFlagTest {

    @Test
    public void namespaceAwareFlagTest() {
        W3CDom w3CDom = new W3CDom();
        w3CDom.namespaceAware(true);
        Assert.assertTrue(w3CDom.namespaceAware());
    }

}