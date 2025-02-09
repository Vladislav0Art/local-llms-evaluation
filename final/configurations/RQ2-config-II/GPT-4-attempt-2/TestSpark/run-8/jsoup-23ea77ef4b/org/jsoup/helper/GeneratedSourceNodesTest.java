package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.sourceNodes(null, Element.class);
    }

    private org.w3c.dom.Document getEmptyW3cDocument() {
        try {
            return javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

}