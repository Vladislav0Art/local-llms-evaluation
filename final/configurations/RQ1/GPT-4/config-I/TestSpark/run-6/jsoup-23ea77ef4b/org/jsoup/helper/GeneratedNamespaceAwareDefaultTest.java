package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathFactory;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareDefaultTest {

    @Test
    public void namespaceAwareDefaultTest() {
        W3CDom w3CDom = new W3CDom();
        assertTrue(w3CDom.namespaceAware());
    }

}