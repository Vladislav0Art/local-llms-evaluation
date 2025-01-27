package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsStringDocumentTest {

    @Test
    public void asStringDocumentTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element div = doc.createElement("div");
        doc.appendChild(div);
        String result = W3CDom.asString(doc);
        assertTrue(result.contains("<html>"));
    }

}