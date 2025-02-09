package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedOutputXmlTest_xmlOutput {

    @Test
    public void OutputXmlTest_xmlOutput() {
        Document doc = new org.jsoup.nodes.Document();
        Map<String, String> properties = W3CDom.OutputXml();
        assertEquals(2, properties.size());
    }

}