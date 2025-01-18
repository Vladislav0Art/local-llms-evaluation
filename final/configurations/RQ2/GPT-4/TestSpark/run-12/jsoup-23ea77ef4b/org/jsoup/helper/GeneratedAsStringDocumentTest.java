package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.junit.Test;
import org.w3c.dom.Document;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAsStringDocumentTest {

    @Test
    public void asStringDocumentTest() throws Exception {
        org.jsoup.nodes.Document in = Jsoup.parse("<html></html>");
        Document w3cDoc = W3CDom.convert(in);
        String result = new W3CDom().asString(w3cDoc);
        assertNotNull(result);
    }

}