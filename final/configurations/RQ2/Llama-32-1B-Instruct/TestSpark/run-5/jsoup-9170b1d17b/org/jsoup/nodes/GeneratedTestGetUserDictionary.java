package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class GeneratedTestGetUserDictionary {

    public static void main(String[] args) throws IOException {
        TestSparkRunner.testRun();
    }

    @Test
    public void testGetUserDictionary() {
        Attributes attributes = new Attributes();
        String[] keyArray = {"testKey"};
        String[] valuesArray = {"value1", "value2"};
        for (int i = 0; i < keyArray.length; i++) {
            Object value = valuesArray[i];
            attributes.put(keyArray[i], value);
        }
        Map<String, Object> expectedMap = new AbstractMap.SimpleMap.SimpleOrderedMap<>();
        expectedMap.put("testKey", "value1");
        expectedMap.put("testKey", "value2");
        assertEquals(expectedMap, attributes.dataset());
    }

}