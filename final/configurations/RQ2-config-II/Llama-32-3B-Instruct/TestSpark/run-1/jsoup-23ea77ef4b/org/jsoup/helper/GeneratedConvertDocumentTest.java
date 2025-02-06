package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertDocumentTest {

    @Test
    public void convertDocumentTest() {
        String html = "<html><body>Hello World!</body></html>";
        Document doc = org.jsoup.Jsoup.parse(html);
        Document convertedDoc = W3CDom.convert(doc);
        assertNotNull(convertedDoc);
    }

}