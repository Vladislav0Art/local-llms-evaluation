package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.Assert;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPropertiesFromMapTest {

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("TestKey", "TestValue");
        Properties result = W3CDom.propertiesFromMap(map);
        Assert.assertEquals("Expected size of result Properties is 1", 1, result.size());
    }

}