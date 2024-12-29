package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class GeneratedPropertiesFromMapTest_returnsCorrectProperties {

    @Test
    public void propertiesFromMapTest_returnsCorrectProperties() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        Properties properties = W3CDom.propertiesFromMap(map);
        assertEquals(1, properties.size());
    }

}