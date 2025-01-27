package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedContextNodeDocumentTest {

    @Test
    public void contextNodeDocumentTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element div = doc.createElement("div");
        doc.appendChild(div);
        Document wDoc = W3CDom.fromJsoup(doc);
        Node result = W3CDom.contextNode(wDoc);
        assertEquals(div, result);
    }

}