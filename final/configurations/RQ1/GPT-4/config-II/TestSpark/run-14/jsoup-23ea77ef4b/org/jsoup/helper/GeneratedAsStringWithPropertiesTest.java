package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jsoup.Jsoup;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class GeneratedAsStringWithPropertiesTest {

    @Test
    public void asStringWithPropertiesTest() {
        final org.jsoup.nodes.Document document = Jsoup.parse("<html><head></head><body></body></html>");
        final W3CDom w3CDom = new W3CDom();
        final Document domDocument = w3CDom.fromJsoup(document);
        assertTrue(w3CDom.asString(domDocument, W3CDom.OutputHtml()).contains("method=\"html\""));
    }

}