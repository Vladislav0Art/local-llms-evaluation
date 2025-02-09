package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedPropertiesFromMapTest {

    @Test
    public void propertiesFromMapTest() {
        HashMap<String, String> map = new HashMap<>();
        map.put(OutputKeys.INDENT, "yes");
        Properties result = W3CDom.propertiesFromMap(map);
        assertTrue(result.containsKey(OutputKeys.INDENT));
    }

}