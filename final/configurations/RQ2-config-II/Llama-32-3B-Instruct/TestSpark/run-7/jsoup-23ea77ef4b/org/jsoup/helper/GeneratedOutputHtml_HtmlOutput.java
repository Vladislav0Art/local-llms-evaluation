package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOutputHtml_HtmlOutput {

    @Test
    public void OutputHtml_HtmlOutput() {
        Document document = new org.jsoup.internal.JsoupInternalDocument();
        HashMap<String, String> expectedHtml = new HashMap<>();
        W3CDom.OutputHtml(document);
        assertEquals(expectedHtml, W3CDom.OutputHtml(document));
    }

}