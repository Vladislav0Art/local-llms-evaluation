package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertDocumentTest2 {

    @Test
    public void convertDocumentTest2() {
        String html = "<html><body>Hello World!</body></html>";
        org.jsoup.nodes.Document in = org.jsoup.Jsoup.parse(html);
        Document out = new org.jsoup.internal.Parser().parse(in, "html");
        W3CDom.convert(in, out);
        assertNotNull(out);
    }

}