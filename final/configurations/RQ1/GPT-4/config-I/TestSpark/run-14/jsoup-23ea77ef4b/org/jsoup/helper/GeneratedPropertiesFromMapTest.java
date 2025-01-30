package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.util.HashMap;
import java.util.Map;

public class GeneratedPropertiesFromMapTest {

    private static final String INPUT_HTML = "<html><head><title>Title</title></head><body>Body</body></html>";

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        java.util.Properties properties = W3CDom.propertiesFromMap(map);
        Assert.assertEquals("value", properties.getProperty("key"));
    }

}