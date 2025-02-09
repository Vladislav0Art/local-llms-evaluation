package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.DOMImplementation;

import static org.junit.Assert.*;

public class GeneratedPropertiesFromMapTest {

    @Test
    public void propertiesFromMapTest() {
        HashMap<String, String> outputParams = W3CDom.OutputHtml();
        Properties result = W3CDom.propertiesFromMap(outputParams);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

}