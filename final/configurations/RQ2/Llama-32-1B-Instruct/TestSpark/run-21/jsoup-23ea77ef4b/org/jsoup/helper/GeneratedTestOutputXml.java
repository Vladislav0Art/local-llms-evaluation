package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.jupiter.api.Test;

public class GeneratedTestOutputXml {

    @Test
    public void testOutputXml() {
        W3CDom doc = new W3CDom();
        String xml = "<html><body>Hello World!</body></html>";
        assertEquals("<html xmlns=\"http://example.com\"><body>Hello World!</body></html>", doc.outputXml(xml));
    }

}