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

public class GeneratedConvertDocumentTest {

    @Test
    public void convertDocumentTest() {
        Document document = Jsoup.parse("<html></html>");
        assertNotNull(W3CDom.convert(document));
    }

}