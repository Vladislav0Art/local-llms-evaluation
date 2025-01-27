package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedOutputXml_EmptyDocument_ReturnsEmptyHashMap {

    @Test
    public void OutputXml_EmptyDocument_ReturnsEmptyHashMap() {
        HashMap<String, String> result = W3CDom.OutputXml();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

}