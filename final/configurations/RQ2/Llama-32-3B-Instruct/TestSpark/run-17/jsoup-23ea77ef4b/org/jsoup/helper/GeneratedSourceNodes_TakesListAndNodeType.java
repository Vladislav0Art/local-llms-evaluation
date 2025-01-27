package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;

public class GeneratedSourceNodes_TakesListAndNodeType {

    @Test
    public void sourceNodes_TakesListAndNodeType() {
        NodeList nodeList = new ArrayList<Node>();
        List<String> expected = new ArrayList<>();
        List<String> actual = W3CDom.sourceNodes(nodeList, String.class);
        assertEquals(expected, actual);
    }

}