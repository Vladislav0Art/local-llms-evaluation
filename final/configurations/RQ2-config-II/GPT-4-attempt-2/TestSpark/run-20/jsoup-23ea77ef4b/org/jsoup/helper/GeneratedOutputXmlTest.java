package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.w3c.dom.Document;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Properties;

public class GeneratedOutputXmlTest {

    @Test
    public void outputXmlTest() {
        HashMap<String, String> outputXml = W3CDom.OutputXml();
        assertNotNull(outputXml);
        assertEquals("xml", outputXml.get(OutputKeys.METHOD));
    }

}