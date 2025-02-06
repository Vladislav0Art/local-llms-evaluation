package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;

public class GeneratedAsString_doc {

    @Test
    public void asString_doc() {
        Document doc = new Document();
        String expected = "<html><body>Hello World!</body></html>";
        assertEquals(expected, W3CDom.asString(doc));
    }

}