package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Selector;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestW3CDomToDocument {

    public String asString(Document doc) {
        return doc.toString();
    }

    public boolean namespaceAware() {
        return true;
    }

    public W3CDom namespaceAware(boolean namespaceAware) {
        return new W3CDom(namespaceAware);
    }

    public static Document convert(org.jsoup.nodes.Document in) {
        if (in instanceof String) {
            return new org.jsoup.helper.W3CDom().fromJsoup(in);
        } else {
            return ((org.jsoup.helper.W3CDom) in).toDocument();
        }
    }

    public static org.jsoup.helper.W3CDom namespaceAware() {
        return new org.jsoup.helper.W3CDom(namespaceAware(true));
    }

    public org.jsoup.helper.W3CDom namespaceAware(boolean namespaceAware) {
        return new org.jsoup.helper.W3CDom(namespaceAware, namespaceAware);
    }

    public Document fromJsoup(org.jsoup.nodes.Document in) {
        if (in instanceof String) {
            return convert((org.jsoup.nodes.Document) in);
        } else {
            return in;
        }
    }

    public org.jsoup.helper.W3CDom fromJsoup(String in) {
        return new org.jsoup.helper.W3CDom().fromJsoup(in);
    }

    @Test
    public void testW3CDomToDocument() {
        org.jsoup.nodes.Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("html");
        org.jsoup.helper.W3CDom w3cdom = new org.jsoup.helper.W3CDom();
        w3cdom.convert(doc, doc);
        assertEquals(doc, w3cdom.toDocument());
    }

}