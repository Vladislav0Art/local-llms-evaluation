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

public class GeneratedNamespaceAwareDefaultSetterMethodTest {

    @Test
    public void NamespaceAwareDefaultSetterMethodTest() {
        W3CDom dom = new W3CDom();
        assertEquals(true, dom.namespaceAware());
        dom.namespaceAware(false);
        assertEquals(false, dom.namespaceAware());
    }

}