package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.junit.Test;
import org.w3c.dom.Document;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void W3CDomConstructorTest() {
        W3CDom object = new W3CDom();
        assertNotNull(object);
    }

    @Test
    public void namespaceAwareTest() {
        W3CDom object = new W3CDom();
        assertTrue(object.namespaceAware());
    }

    @Test
    public void namespaceAwareBooleanTest() {
        W3CDom object = new W3CDom().namespaceAware(false);
        assertFalse(object.namespaceAware());
    }

    @Test
    public void convertDocumentInTest() throws Exception {
        org.jsoup.nodes.Document in = Jsoup.parse("<html></html>");
        Document out = W3CDom.convert(in);
        assertNotNull(out);
        assertEquals("html", out.getDocumentElement().getTagName());
    }

    @Test
    public void asStringMapPropertiesTest() throws Exception {
        org.jsoup.nodes.Document in = Jsoup.parse("<html></html>");
        Document w3cDoc = W3CDom.convert(in);
        Map<String, String> map = new HashMap<>();
        assertNotNull(W3CDom.asString(w3cDoc, map));
    }

    @Test
    public void fromJsoupDocumentInTest() throws Exception {
        W3CDom object = new W3CDom();
        org.jsoup.nodes.Document in = Jsoup.parse("<html></html>");
        Document out = object.fromJsoup(in);
        assertNotNull(out);
        assertEquals("html", out.getDocumentElement().getTagName());
    }

    @Test
    public void fromJsoupElementInTest() throws Exception {
        W3CDom object = new W3CDom();
        org.jsoup.nodes.Element in = Jsoup.parse("<div></div>").body().child(0);
        Document out = object.fromJsoup(in);
        assertNotNull(out);
        assertEquals("div", out.getDocumentElement().getTagName());
    }

    @Test
    public void asStringDocumentTest() throws Exception {
        org.jsoup.nodes.Document in = Jsoup.parse("<html></html>");
        Document w3cDoc = W3CDom.convert(in);
        String result = new W3CDom().asString(w3cDoc);
        assertNotNull(result);
    }

}