package org.jsoup.helper;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.DOMException;
import org.w3c.dom.Node;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedSelectXpathDocumentNotNullParametersTest {

    @Test
    public void selectXpathDocumentNotNullParametersTest() throws Exception {
        Document document = ...; // create valid W3C document with nodes
        W3CDom w3cDom = new W3CDom();
        NodeList nodeList = w3cDom.selectXpath("/node/path", document);
        assertNotNull(nodeList);
    }

}