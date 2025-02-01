package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedOutputXmlTest {

    @Test
    public void outputXmlTest() {
        HashMap<String, String> xmlOutput = W3CDom.OutputXml();

        assertNotNull(xmlOutput);
        assertTrue(xmlOutput.containsKey("method"));
        assertEquals("xml", xmlOutput.get("method"));
    }

}