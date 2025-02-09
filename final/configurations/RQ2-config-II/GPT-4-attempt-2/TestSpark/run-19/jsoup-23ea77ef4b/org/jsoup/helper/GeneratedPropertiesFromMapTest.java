package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.HashMap;

public class GeneratedPropertiesFromMapTest {

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("method", "xml");
        results.put("indent", "yes");
        Properties result = W3CDom.propertiesFromMap(map);
        Assert.assertEquals("xml", result.getProperty("method"));
        Assert.assertEquals("yes", result.getProperty("indent"));
    }

}