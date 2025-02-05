package org.jsoup.helper;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

public class GeneratedAsStringTest {

    @Test
    public void asStringTest() {
        W3CDom w3CDom = new W3CDom();
        Document document = w3CDom.fromJsoup(new Document(""));
        assertNotNull(w3CDom.asString(document));
    }

}