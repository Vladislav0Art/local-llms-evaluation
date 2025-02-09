package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedConvertW3CDocumentToStringTest {

    @Test
    public void ConvertW3CDocumentToStringTest() {
        Document doc = new Document("test");
        org.w3c.dom.Document w3cDoc = W3CDom.convert(doc);
        String result = W3CDom.asString(w3cDoc, null);
        assertNotNull(result);
    }

}