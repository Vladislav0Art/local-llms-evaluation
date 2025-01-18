package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.transform.dom.DOMSource;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareWithParameterTest {

    @Test
    public void namespaceAwareWithParameterTest() {
        W3CDom w3cDom = new W3CDom().namespaceAware(true);
        assertTrue(w3cDom.namespaceAware());
    }

}