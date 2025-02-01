package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3cDom = new W3CDom();
        assertTrue(w3cDom.namespaceAware());
    }

}