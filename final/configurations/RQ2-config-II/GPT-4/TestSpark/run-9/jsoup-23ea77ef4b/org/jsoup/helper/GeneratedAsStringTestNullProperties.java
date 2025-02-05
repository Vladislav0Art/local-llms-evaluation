package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedAsStringTestNullProperties {

    @Test
    public void asStringTestNullProperties() {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        org.w3c.dom.Document document = dBuilder.newDocument();
        assertNotNull(W3CDom.asString(document, null));
    }

}