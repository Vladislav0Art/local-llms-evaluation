package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedConvertTest {

    @Test
    public void convertTest() {
        Document document = new Document("");
        W3CDom w3cDom = new W3CDom();
        assertNotNull(W3CDom.convert(document));
    }

}