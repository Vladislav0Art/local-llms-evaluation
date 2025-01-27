package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedSelectXpath_EmptyString_ReturnsEmptyList {

    @Test
    public void selectXpath_EmptyString_ReturnsEmptyList() {
        NodeList result = W3CDom.selectXpath("", null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

}