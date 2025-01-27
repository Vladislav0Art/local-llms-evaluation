package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import static org.junit.Assert.*;

public class GeneratedFromJsoupDocument {

    @Test
    public void fromJsoupDocument() {
        Document in = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        Document wDoc = W3CDom.fromJsoup(in);
        assertNotNull(wDoc);
    }

}