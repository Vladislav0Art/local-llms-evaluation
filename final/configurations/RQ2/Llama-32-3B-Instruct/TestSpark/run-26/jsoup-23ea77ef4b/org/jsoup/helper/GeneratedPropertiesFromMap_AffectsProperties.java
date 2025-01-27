package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.select.NodeTraversor;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedPropertiesFromMap_AffectsProperties {

    @Test
    public void propertiesFromMap_AffectsProperties() {
        Map<String, String> map = new HashMap<>();
        Properties props = W3CDom.propertiesFromMap(map);
        assertNotNull(props);
    }

}