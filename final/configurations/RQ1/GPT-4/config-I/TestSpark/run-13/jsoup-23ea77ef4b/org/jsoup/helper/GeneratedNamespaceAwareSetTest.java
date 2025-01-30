package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class GeneratedNamespaceAwareSetTest {

    @Test
    public void namespaceAwareSetTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.namespaceAware(false);
        Assert.assertFalse(w3cDom.namespaceAware());
    }

}