package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.Assert;
import org.w3c.dom.NodeList;

import java.util.HashMap;

public class GeneratedNamespaceAwareSettingTest {

    @Test
    public void namespaceAwareSettingTest() {
        W3CDom w3CDom = new W3CDom();
        W3CDom result = w3CDom.namespaceAware(true);
        Assert.assertNotNull(result);
        Assert.assertTrue(true == result.namespaceAware());
    }

}