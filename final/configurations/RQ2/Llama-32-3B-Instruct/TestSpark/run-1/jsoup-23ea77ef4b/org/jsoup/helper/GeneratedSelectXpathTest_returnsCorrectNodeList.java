package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class GeneratedSelectXpathTest_returnsCorrectNodeList {

    @Test
    public void selectXpathTest_returnsCorrectNodeList() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        NodeList nodeList = doc.getDocumentElement().getChildNodes();
        W3CDom.W3CDom.NodeVisitor visitor = new W3CDom.W3CDom.NodeVisitor() {
            @Override
            public void visit(Node node) {
                assertEquals(1, nodeList.getLength());
            }
        };
        NodeList result = W3CDom.selectXpath("*/node", doc);
        assertTrue(result.getLength() > 0);
    }

}