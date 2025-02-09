package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.HashMap;

public class GeneratedNamespaceAwareWithParamTest {

    @Test
    public void namespaceAwareWithParamTest() {
        W3CDom w3cdom = new W3CDom().namespaceAware(true);
        Assert.assertEquals(true, w3cdom.namespaceAware());
    }

}