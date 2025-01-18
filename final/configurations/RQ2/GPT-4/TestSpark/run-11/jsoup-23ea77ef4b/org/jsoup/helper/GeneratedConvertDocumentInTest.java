package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedConvertDocumentInTest {

    @Test
    public void convertDocumentInTest() {
        Document document = new Document("");
        assertNotNull(W3CDom.convert(document));
    }

}