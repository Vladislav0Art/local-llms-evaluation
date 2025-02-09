package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayOutputStream;
import java.util.Map;

public class GeneratedAsString_NoProperties {

    @Test
    public void asString_NoProperties() {
        Map<String, String> properties = new HashMap<>();
        String result = W3CDom.asString(null, properties);
        assertTrue(result.contains("Unknown"));
    }

}