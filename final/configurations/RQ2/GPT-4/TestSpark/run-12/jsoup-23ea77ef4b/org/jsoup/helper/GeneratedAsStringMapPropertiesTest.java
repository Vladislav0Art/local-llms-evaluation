package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.junit.Test;
import org.w3c.dom.Document;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAsStringMapPropertiesTest {

    @Test
    public void asStringMapPropertiesTest() throws Exception {
        org.jsoup.nodes.Document in = Jsoup.parse("<html></html>");
        Document w3cDoc = W3CDom.convert(in);
        Map<String, String> map = new HashMap<>();
        assertNotNull(W3CDom.asString(w3cDoc, map));
    }

}