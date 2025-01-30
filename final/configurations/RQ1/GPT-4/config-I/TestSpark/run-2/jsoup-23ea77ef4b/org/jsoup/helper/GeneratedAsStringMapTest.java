package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAsStringMapTest {

    private W3CDom w3CDom = new W3CDom();
    private org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><head><title>First parse</title></head>"
            + "<body><p>Post Content</p></body></html>");

    @Test
    public void asStringMapTest() {
        Document doc = w3CDom.convert(jsoupDoc);
        W3CDom.asString(doc, new HashMap<String, String>());
    }

}