package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import static org.junit.Assert.*;

public class GeneratedFromJsoupElement {

    @Test
    public void fromJsoupElement() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().createDocument();
        Element in = doc.createElement("div");
        Document wDoc = W3CDom.fromJsoup(in);
        assertNotNull(wDoc);
    }

}