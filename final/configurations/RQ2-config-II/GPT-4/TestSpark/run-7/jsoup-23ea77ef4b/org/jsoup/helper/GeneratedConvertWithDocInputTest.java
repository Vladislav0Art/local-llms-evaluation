package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedConvertWithDocInputTest {

    @Test
    public void convertWithDocInputTest() {
        Document document = new Document(OutputKeys.METHOD);
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document out = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        // This method does not return a value, we test it for exceptions thrown
        w3CDom.convert(document, out);
    }

}