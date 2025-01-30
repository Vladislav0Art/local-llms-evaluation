package org.jsoup.helper;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Selector.SelectorParseException;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.List;

public class GeneratedConvertJsoupDocumenttoW3cTest {

    @Test
    public void convertJsoupDocumenttoW3cTest() {
        Document jsoupDocument = Jsoup.parse("<html><head></head><body></body></html>");
        org.w3c.dom.Document w3cDocument = W3CDom.convert(jsoupDocument);

        assertEquals("#document", w3cDocument.getNodeName());
        assertEquals("html", w3cDocument.getDocumentElement().getNodeName());
    }

}