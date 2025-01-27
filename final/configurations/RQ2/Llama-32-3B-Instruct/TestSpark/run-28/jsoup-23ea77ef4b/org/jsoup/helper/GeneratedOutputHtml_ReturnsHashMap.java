package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedOutputHtml_ReturnsHashMap {

    @Test
    public void OutputHtml_ReturnsHashMap() {
        Map<String, String> test = new HashMap<>();
        HashMap<String, String> result = W3CDom.OutputHtml();
        assertTrue(result instanceof HashMap);
    }

}