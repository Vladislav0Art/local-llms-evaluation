package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedConvertDocumentTest {

    @Test
    public void convertDocumentTest() {
        org.jsoup.nodes.Document document = Jsoup.parse("<html></html>");
        Document result = W3CDom.convert(document);
        assertNotNull(result);
    }

}