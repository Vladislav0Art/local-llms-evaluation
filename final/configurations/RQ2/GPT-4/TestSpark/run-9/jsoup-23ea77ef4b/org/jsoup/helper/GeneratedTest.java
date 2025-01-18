package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.Selector;
import org.junit.Test;
import org.w3c.dom.NodeList;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom dom = new W3CDom();
        assertNotNull(dom.namespaceAware(true));
    }

    @Test
    public void convertTest() {
        org.jsoup.nodes.Document document = Jsoup.parse("<html></html>");
        assertNotNull(W3CDom.convert(document));
    }

    @Test
    public void asStringWithPropertiesTest() {
        org.jsoup.nodes.Document document = Jsoup.parse("<html></html>");
        org.w3c.dom.Document w3cDoc = W3CDom.convert(document);
        assertNotNull(W3CDom.asString(w3cDoc, W3CDom.OutputHtml()));
    }

    @Test
    public void propertiesFromMapTest() {
        assertNotNull(W3CDom.propertiesFromMap(W3CDom.OutputHtml()));
    }

    @Test
    public void outputHtmlTest() {
        assertNotNull(W3CDom.OutputHtml());
        assertTrue(W3CDom.OutputHtml().size() > 0);
    }

    @Test
    public void outputXmlTest() {
        assertNotNull(W3CDom.OutputXml());
        assertTrue(W3CDom.OutputXml().size() > 0);
    }

    @Test
    public void fromJsoupDocumentTest() {
        W3CDom dom = new W3CDom();
        org.jsoup.nodes.Document document = Jsoup.parse("<html></html>");
        assertNotNull(dom.fromJsoup(document));
    }

    @Test
    public void fromJsoupElementTest() {
        W3CDom dom = new W3CDom();
        org.jsoup.nodes.Document document = Jsoup.parse("<html><head><title>Test</title></head></html>");
        assertNotNull(dom.fromJsoup(document.head()));
    }

    @Test
    public void asStringTest() {
        W3CDom dom = new W3CDom();
        org.jsoup.nodes.Document document = Jsoup.parse("<html></html>");
        org.w3c.dom.Document w3cDoc = dom.fromJsoup(document);
        assertNotNull(dom.asString(w3cDoc));
    }

    @Test
    public void convertInAndOutTest() {
        W3CDom dom = new W3CDom();
        org.jsoup.nodes.Document in = Jsoup.parse("<html></html>");
        org.w3c.dom.Document out = dom.fromJsoup(in);
        dom.convert(in, out);
        assertNotNull(out);
    }

    @Test
    public void convertElementInAndOutTest() {
        W3CDom dom = new W3CDom();
        org.jsoup.nodes.Document document = Jsoup.parse("<html><body><div>Test</div></body></html>");
        org.w3c.dom.Document out = dom.fromJsoup(document);
        dom.convert(document.body(), out);
        assertNotNull(out);
    }

}