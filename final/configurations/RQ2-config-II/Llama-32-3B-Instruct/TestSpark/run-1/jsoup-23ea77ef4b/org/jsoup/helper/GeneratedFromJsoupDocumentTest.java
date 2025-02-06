package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFromJsoupDocumentTest {

    @Test
    public void fromJsoupDocumentTest() {
        Document soupDoc = org.jsoup.Jsoup.parse("<html><body>Hello World!</body></html>");
        Document convertedDoc = W3CDom.fromJsoup(soupDoc);
        assertNotNull(convertedDoc);
    }

}