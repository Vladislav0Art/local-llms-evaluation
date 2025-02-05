package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedConvertDocumentOutTest {

    @Test
    public void convertDocumentOutTest() {
        Document document = new Document("test");
        org.w3c.dom.Document out = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        W3CDom w3CDom = new W3CDom();
        w3CDom.convert(document, out);
        assertNotNull(out);
    }

}