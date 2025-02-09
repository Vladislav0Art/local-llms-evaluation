package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Attribute;
import org.jsoup.select.NodeVisitor;
import org.jsoup.helper.W3CDom;

public class GeneratedSelectXpath_FromDocument {

    @Test
    public void selectXpath_FromDocument() throws Exception {
        Document inDoc = new Document();
        inDoc.appendChild(new Element("div").appendText("Hello"));
        NodeList nodeList = W3CDom.selectXpath("//div", inDoc);
        assertEquals(1, nodeList.size());
    }

}