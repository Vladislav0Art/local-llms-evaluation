package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import static org.junit.Assert.*;

public class GeneratedAsStringDocumentWithProperties {

    @Test
    public void asStringDocumentWithProperties() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().createDocument();
        String result = W3CDom.asString(doc, new HashMap<String, String>());
        assertTrue(result.contains("<html>"));
    }

}