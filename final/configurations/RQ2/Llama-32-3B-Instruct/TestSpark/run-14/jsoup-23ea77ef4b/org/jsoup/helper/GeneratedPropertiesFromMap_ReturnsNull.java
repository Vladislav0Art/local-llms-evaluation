package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedPropertiesFromMap_ReturnsNull {

    @Test
    public void propertiesFromMap_ReturnsNull() {
        Properties properties = W3CDom.propertiesFromMap(null);
        assertNull(properties);
    }

}