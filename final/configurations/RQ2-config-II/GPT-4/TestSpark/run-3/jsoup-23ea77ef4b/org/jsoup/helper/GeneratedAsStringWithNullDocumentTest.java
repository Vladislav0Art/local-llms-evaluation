package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.DOMException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedAsStringWithNullDocumentTest {

    @Test
    public void asStringWithNullDocumentTest() {
        Map<String, String> properties = new HashMap<>();
        W3CDom.asString(null, properties);
    }

}