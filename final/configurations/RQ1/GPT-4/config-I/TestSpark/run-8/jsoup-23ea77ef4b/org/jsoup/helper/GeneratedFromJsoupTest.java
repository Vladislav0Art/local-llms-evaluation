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

public class GeneratedFromJsoupTest {

    @Test
    public void fromJsoupTest() {
        W3CDom dom = new W3CDom();
        Document jsoupDocument = Jsoup.parse("<html><head></head><body></body></html>");
        org.w3c.dom.Document w3cDocument = dom.fromJsoup(jsoupDocument);

        assertEquals("#document", w3cDocument.getNodeName());
        assertEquals("html", w3cDocument.getDocumentElement().getNodeName());
    }

}