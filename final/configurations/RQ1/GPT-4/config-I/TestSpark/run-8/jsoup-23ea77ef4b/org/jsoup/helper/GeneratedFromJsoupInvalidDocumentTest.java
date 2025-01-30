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

public class GeneratedFromJsoupInvalidDocumentTest {

    @Test
    public void fromJsoupInvalidDocumentTest() {
        W3CDom dom = new W3CDom();
        Document jsoupDocument = Jsoup.parse("<div><i<<</i></div>", "", Parser.xmlParser());
        dom.fromJsoup(jsoupDocument);
    }

}