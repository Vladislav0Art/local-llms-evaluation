package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsStringDocumentTest {

    @Test
    public void asStringDocumentTest() {
        Document doc = new Document();
        String result = W3CDom.asString(doc);
        assertNotNull(result);
    }

}