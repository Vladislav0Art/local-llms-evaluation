package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;

public class GeneratedContextNode_doc_ReturnsContextNode {

    @Test
    public void contextNode_doc_ReturnsContextNode() {
        Document doc = new org.w3c.dom.Document(); // Mock Doc
        Node contextNode = W3CDom.contextNode(doc);
        assertNotNull(contextNode);
    }

}