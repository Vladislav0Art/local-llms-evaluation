package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.Map;

public class GeneratedPropertiesFromMap_returnsCorrectProperties {

    @Test
    public void propertiesFromMap_returnsCorrectProperties() {
        Map<String, String> map = Mockito.mock(Map.class);
        Properties expected = new Properties();
        Properties result = W3CDom.propertiesFromMap(map);
        assertEquals(expected, result);
    }

}