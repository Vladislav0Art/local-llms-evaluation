package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Properties;

public class GeneratedPropertiesFromMapTest {

    @Test
    public void propertiesFromMapTest() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");
        Properties properties = W3CDom.propertiesFromMap(map);
        Assert.assertNotNull(properties);
        Assert.assertTrue(properties.containsKey("key"));
        Assert.assertEquals("value", properties.getProperty("key"));
    }

}