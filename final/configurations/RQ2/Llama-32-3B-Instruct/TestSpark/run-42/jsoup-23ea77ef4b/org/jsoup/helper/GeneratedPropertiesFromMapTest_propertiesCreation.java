package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPropertiesFromMapTest_propertiesCreation {

    @Test
    public void propertiesFromMapTest_propertiesCreation() {
        Map<String, String> map = new HashMap<>();
        Properties props = W3CDom.propertiesFromMap(map);
        assertNotNull(props);
    }

}