package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.helper.W3CDom;
import org.w3c.dom.NodeList;

import java.util.List;
import java.util.HashMap;

import org.jsoup.Jsoup;

public class GeneratedFromJsoupDocumentTest {

    @Test
    public void fromJsoupDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        Document document = Jsoup.parse("<html></html>");
        assertNotNull(w3cDom.fromJsoup(document));
    }

}