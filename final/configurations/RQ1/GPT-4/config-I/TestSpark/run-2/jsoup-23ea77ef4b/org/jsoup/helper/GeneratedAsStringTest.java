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

public class GeneratedAsStringTest {

    private W3CDom w3CDom = new W3CDom();
    private org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><head><title>First parse</title></head>"
            + "<body><p>Post Content</p></body></html>");

    @Test
    public void asStringTest() {
        Document doc = w3CDom.fromJsoup(jsoupDoc);
        assertNotNull(w3CDom.asString(doc));
    }

}