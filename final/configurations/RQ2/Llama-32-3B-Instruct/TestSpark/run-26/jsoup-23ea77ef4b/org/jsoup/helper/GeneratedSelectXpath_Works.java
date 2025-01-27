package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.select.NodeTraversor;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedSelectXpath_Works {

    @Test
    public void selectXpath_Works() {
        Document doc = Document.createDocumentBuilder().newDocument();
        NodeList nodeList = W3CDom.selectXpath("div", doc);
        assertNotNull(nodeList);
    }

}