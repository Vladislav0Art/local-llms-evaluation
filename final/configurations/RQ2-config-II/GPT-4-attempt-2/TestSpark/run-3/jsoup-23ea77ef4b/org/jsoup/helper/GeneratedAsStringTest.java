package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAsStringTest {

    @Test
    public void asStringTest() {
        // Here, create and convert a JSoup Document to W3C Document and convert that to a string
        Document in = new Document("Test");
        org.w3c.dom.Document out = W3CDom.convert(in);
        String xml = new W3CDom().asString(out);

        assertNotNull(xml);
        // Add assertions to check actual XML string.
    }

}