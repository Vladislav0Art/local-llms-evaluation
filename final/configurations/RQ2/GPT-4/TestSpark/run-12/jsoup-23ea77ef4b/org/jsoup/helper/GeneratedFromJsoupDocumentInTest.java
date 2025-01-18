package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.junit.Test;
import org.w3c.dom.Document;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedFromJsoupDocumentInTest {

    @Test
    public void fromJsoupDocumentInTest() throws Exception {
        W3CDom object = new W3CDom();
        org.jsoup.nodes.Document in = Jsoup.parse("<html></html>");
        Document out = object.fromJsoup(in);
        assertNotNull(out);
        assertEquals("html", out.getDocumentElement().getTagName());
    }

}