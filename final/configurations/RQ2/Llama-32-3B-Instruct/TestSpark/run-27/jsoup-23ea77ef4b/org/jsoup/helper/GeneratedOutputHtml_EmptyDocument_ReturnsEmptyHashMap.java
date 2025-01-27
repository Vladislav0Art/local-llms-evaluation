package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedOutputHtml_EmptyDocument_ReturnsEmptyHashMap {

    @Test
    public void OutputHtml_EmptyDocument_ReturnsEmptyHashMap() {
        HashMap<String, String> result = W3CDom.OutputHtml();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

}