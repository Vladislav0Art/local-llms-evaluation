package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedOutputXmlTest {

    @Test
    public void outputXmlTest() throws ParserConfigurationException {
        HashMap<String, String> outputXml = W3CDom.OutputXml();
        assertEquals("xml", outputXml.get("method"));
    }

}