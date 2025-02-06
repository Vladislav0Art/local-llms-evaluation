package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.NodeList;
import org.w3c.dom.DocumentType;

public class GeneratedOutputHtmlFromJsoup_ReturnsNonNullDocument {

    @Test
    public void outputHtmlFromJsoup_ReturnsNonNullDocument() {
        Document in = new Document();
        Document out = W3CDom.OutputHtml().put("in", in);
        assertNotNull(out);
    }

}