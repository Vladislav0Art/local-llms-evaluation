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

public class GeneratedPropertiesFromMapTest {

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> propertiesMap = new HashMap<>();
        propertiesMap.put("testKey", "testValue");
        Properties properties = W3CDom.propertiesFromMap(propertiesMap);
        Assert.assertEquals(properties.get("testKey"), "testValue");
    }

}