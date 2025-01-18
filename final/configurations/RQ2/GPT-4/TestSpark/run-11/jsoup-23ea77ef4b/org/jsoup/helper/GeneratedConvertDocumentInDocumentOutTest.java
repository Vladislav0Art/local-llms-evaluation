package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedConvertDocumentInDocumentOutTest {

    @Test
    public void convertDocumentInDocumentOutTest() {
        Document document = new Document("");
        W3CDom w3CDom = new W3CDom();
        w3CDom.convert(document, document);
        assertNotNull(document);
    }

}