package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAsStringOnlyDocNullPropertiesTest {

    @Test
    public void asStringOnlyDocNullPropertiesTest() {
        W3CDom testObj = new W3CDom();
        javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        javax.xml.parsers.DocumentBuilder builder = factory.newDocumentBuilder();
        org.w3c.dom.Document doc = builder.newDocument();
        assertNotNull(testObj.asString(doc));
    }

}