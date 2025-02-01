package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class GeneratedAsStringDocumentPropertiesTest {

    @Test
    public void asStringDocumentPropertiesTest() {
        org.jsoup.nodes.Document jsoupDoc = new org.jsoup.nodes.Document("");
        Document w3cDoc = W3CDom.convert(jsoupDoc);
        Map<String, String> properties = new HashMap<>();
        properties.put("testKey", "testValue");
        String result = W3CDom.asString(w3cDoc, properties);
        Assert.assertNotNull(result);
    }

}