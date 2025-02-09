package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayOutputStream;
import java.util.Map;

public class GeneratedOutputXml {

    @Test
    public void OutputXml() {
        Properties properties = W3CDom.propertiesFromMap(Map.of("foo", "bar"));
        Map<String, String> outputXml = W3CDom.OutputXml();
        assertTrue(outputXml.containsKey("xmlns"));
        assertEquals(properties, outputXml);
    }

}