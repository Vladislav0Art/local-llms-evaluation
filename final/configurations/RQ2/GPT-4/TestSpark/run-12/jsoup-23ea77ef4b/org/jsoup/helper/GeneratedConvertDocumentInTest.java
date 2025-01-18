package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.junit.Test;
import org.w3c.dom.Document;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedConvertDocumentInTest {

    @Test
    public void convertDocumentInTest() throws Exception {
        org.jsoup.nodes.Document in = Jsoup.parse("<html></html>");
        Document out = W3CDom.convert(in);
        assertNotNull(out);
        assertEquals("html", out.getDocumentElement().getTagName());
    }

}