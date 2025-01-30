package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.W3CDom;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import java.util.Properties;
import java.util.HashMap;
import java.util.Map;

public class GeneratedPropertiesFromMapTest {

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put(OutputKeys.MEDIA_TYPE, "text/html");
        map.put(OutputKeys.ENCODING, "UTF-8");

        Properties properties = W3CDom.propertiesFromMap(map);
        Assert.assertEquals("text/html", properties.getProperty(OutputKeys.MEDIA_TYPE));
        Assert.assertEquals("UTF-8", properties.getProperty(OutputKeys.ENCODING));
    }

}