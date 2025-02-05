package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.helper.W3CDom;
import org.w3c.dom.NodeList;

import java.util.List;
import java.util.HashMap;

import org.jsoup.Jsoup;

public class GeneratedAsStringPropertiesTest {

    @Test
    public void asStringPropertiesTest() {
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document document = W3CDom.convert(Jsoup.parse("<html></html>"));
        HashMap<String, String> properties = new HashMap<>();
        properties.put("property1", "value1");
        assertNotNull(W3CDom.asString(document, properties));
    }

}