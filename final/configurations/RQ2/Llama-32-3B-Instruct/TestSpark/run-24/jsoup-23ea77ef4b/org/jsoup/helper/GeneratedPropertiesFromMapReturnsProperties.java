package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedPropertiesFromMapReturnsProperties {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private Transformer transformer;

    @Mock
    private DocumentBuilderFactory documentFactory;

    @Test
    public void propertiesFromMapReturnsProperties() {
        Map<String, String> map = new HashMap<>();
        Properties result = org.jsoup.helper.W3CDom.propertiesFromMap(map);
        assertNotNull(result);
    }

}