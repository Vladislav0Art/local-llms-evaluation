package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedOutputXmlReturnsPropertiesMap {

    @Test
    public void OutputXmlReturnsPropertiesMap() {
        Properties result = W3CDom.OutputXml();
        assertNotNull(result);
        assertTrue(result.containsKey("method"));
    }

}