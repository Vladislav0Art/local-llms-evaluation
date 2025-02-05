package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedOutputXmlTest {

    @Test
    public void outputXmlTest() {
        HashMap<String, String> properties = W3CDom.OutputXml();
        assertNotNull(properties);
        assertTrue(properties.containsKey(METHOD));
    }

}