package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import java.util.HashMap;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedConvertDocumentTest {

    @Test
    public void convertDocumentTest() {
        Document jsoupDoc = new Document("");
        W3CDom instance = new W3CDom();

        org.w3c.dom.Document document = W3CDom.convert(jsoupDoc);
        assertNotNull(document);
    }

}