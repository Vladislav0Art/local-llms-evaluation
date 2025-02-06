package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import java.util.HashMap;

public class GeneratedPropertiesFromMap Test {

    @Test
    public void propertiesFromMap

    Test() {
        Map<String, String> map = new HashMap<>();
        Properties properties = W3CDom.propertiesFromMap(map);
        assertNotNull(properties);
    }

}