package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedPropertiesFromMapToProperties {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Mock
    private DocumentBuilder documentBuilder;

    @InjectMocks
    private W3CDom w3cdom;

    @Test
    public void propertiesFromMapToProperties() {
        Map<String, String> map = new HashMap<>();
        Properties result = W3CDom.propertiesFromMap(map);
        assertNotNull(result);
    }

}