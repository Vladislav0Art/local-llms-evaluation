package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedOutputXmlTest {

    W3CDom w3cDom = new W3CDom();

    @Test
    public void outputXmlTest() {
        HashMap<String, String> properties = W3CDom.OutputXml();
        assertEquals("xml", properties.get(METHOD));
    }

}