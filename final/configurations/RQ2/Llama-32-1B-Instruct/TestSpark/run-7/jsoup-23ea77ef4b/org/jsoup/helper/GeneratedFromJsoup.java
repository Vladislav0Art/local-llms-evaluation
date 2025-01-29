package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Selector;
import org.jsoup.util.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringWriter;

public class GeneratedFromJsoup {

    private Document doc = parseString("html");

    @Test
    public void fromJsoup() {
        Element el = doc.select("body").first();
        W3CDom w3cdom = new W3CDom();
        Document result = w3cdom.fromJsoup(el);
        assertNotNull(result);
        assertEquals(el, result.getOwnerDocument());
    }

}