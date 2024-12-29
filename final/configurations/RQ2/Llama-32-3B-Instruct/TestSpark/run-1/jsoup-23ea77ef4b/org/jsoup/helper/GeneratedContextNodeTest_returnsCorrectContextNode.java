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
public class GeneratedContextNodeTest_returnsCorrectContextNode {

    @Test
    public void contextNodeTest_returnsCorrectContextNode() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Node contextNode = W3CDom.contextNode(doc);
        assertEquals(1, doc.getDocumentElement().getChildNodes().getLength());
    }

}