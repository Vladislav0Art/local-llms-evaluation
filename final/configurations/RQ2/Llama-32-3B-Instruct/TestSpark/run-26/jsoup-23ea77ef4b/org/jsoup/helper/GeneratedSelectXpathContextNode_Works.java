package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.select.NodeTraversor;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedSelectXpathContextNode_Works {

    @Test
    public void selectXpathContextNode_Works() {
        Document doc = Document.createDocumentBuilder().newDocument();
        Element elem = doc.createElement("div");
        NodeList nodeList = W3CDom.selectXpath("div", elem);
        assertNotNull(nodeList);
    }

}