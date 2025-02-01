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

public class GeneratedConvertTest {

    @Test
    public void convertTest() {
        final org.jsoup.nodes.Document document = Jsoup.parse("<html><head></head><body></body></html>");
        final Document convertedDocument = W3CDom.convert(document);
        assertEquals("html", convertedDocument.getDocumentElement().getNodeName());
    }

}