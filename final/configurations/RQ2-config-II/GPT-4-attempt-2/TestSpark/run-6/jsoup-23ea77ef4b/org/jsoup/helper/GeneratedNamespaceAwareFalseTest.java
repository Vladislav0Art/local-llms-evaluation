package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.junit.Assert;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;

public class GeneratedNamespaceAwareFalseTest {

    @Test
    public void namespaceAwareFalseTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.namespaceAware(false);
        Assert.assertFalse(w3cDom.namespaceAware());
    }

}