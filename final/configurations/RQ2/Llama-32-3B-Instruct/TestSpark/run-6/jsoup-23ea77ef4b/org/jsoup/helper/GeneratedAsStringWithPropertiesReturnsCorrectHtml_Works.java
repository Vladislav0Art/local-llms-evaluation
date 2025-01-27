package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedAsStringWithPropertiesReturnsCorrectHtml_Works {

    @Test
    public void asStringWithPropertiesReturnsCorrectHtml_Works() throws Exception {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        assertEquals("<html><body>Hello World!</body></html>", W3CDom.asString(doc, null));
        assertEquals("<p>Hello World!</p>", W3CDom.asString(doc, Map.of("syntax", "method")));
    }

}