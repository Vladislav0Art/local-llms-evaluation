package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedFromJsoupTest {

    @Test
    public void fromJsoupTest() {
        Document document = new Document("");
        W3CDom w3cDom = new W3CDom();
        assertNotNull(w3cDom.fromJsoup(document));
    }

}