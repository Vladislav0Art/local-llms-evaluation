package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedAsStringFromDocWithPropertiesTest {

    @Test
    public void asStringFromDocWithPropertiesTest() {
        org.w3c.dom.Document doc = Mockito.mock(org.w3c.dom.Document.class);
        Map<String, String> properties = new HashMap<>();
        properties.put("propertyKey", "propertyValue");
        String result = W3CDom.asString(doc, properties);
        assertNotNull(result);
    }

}