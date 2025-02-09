package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayOutputStream;
import java.util.Map;

public class GeneratedOutputHtml {

    @Test
    public void OutputHtml() {
        Properties properties = W3CDom.propertiesFromMap(Map.of("foo", "bar"));
        Map<String, String> outputHtml = W3CDom.OutputHtml();
        assertEquals(properties, outputHtml);
    }

}